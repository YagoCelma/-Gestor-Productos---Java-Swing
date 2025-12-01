package Dominio;

import DAO.Conexion_DB;
import Transversal.DetallesVentas;
import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DDetallesVentas {

    Conexion_DB conexion = new Conexion_DB();

    public void crearDetallesVenta(DetallesVentas detalles) throws SQLException {

        String sql = "insert into detallesventa (id_venta, id_producto, cantidad, precio_unitario_venta, iva, descuento) values (?,?,?,?,?,?);";

        try {
            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);

            cs.setInt(1, detalles.getIdVenta());
            cs.setInt(2, detalles.getIdProducto());
            cs.setInt(3, detalles.getCantidad());
            cs.setDouble(4, detalles.getPrecioUnitario());
            cs.setInt(5, detalles.getIva());
            cs.setBoolean(6, detalles.isDescuento());

            System.out.println(cs);

            //Esto lo podria hacer en un solo if pero prefiero hacero en 2 para devolver exatamente el error que da
            //En el primero verifico si existe o no el producto de la tabla de productos 
            //En el segundo verifico si ya existe en la tabla esa relacion de idVenta y idProducto(porqeu es clave primaria)
            if (comprobarProducto(detalles.getIdProducto())) {
                if (!comprobarExistenciaID(detalles.getIdVenta(), detalles.getIdProducto())) {
                    cs.execute();
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe esa relacion ID Venta Producto", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese ID de Producto", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public void listarDetallesVentas(JTable tbl_detalles) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = " select * from detallesventa order by id_producto asc;";

        modelo.addColumn("id_venta");
        modelo.addColumn("id_producto");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio_unitario_venta");
        modelo.addColumn("iva");
        modelo.addColumn("descuento");

        String datos[] = new String[6];

        Statement st;

        try {
            st = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);

                modelo.addRow(datos);
            }

            tbl_detalles.setModel(modelo);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public void seleccionarDetalles(JTable tbl_detalles, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JComboBox cbx1, JRadioButton rb1) {

        try {
            int filaSeleccionada = tbl_detalles.getSelectedRow();

            if (filaSeleccionada >= 0) {

                txt1.setText(tbl_detalles.getValueAt(filaSeleccionada, 0).toString());
                txt2.setText(tbl_detalles.getValueAt(filaSeleccionada, 1).toString());
                txt3.setText(tbl_detalles.getValueAt(filaSeleccionada, 2).toString());
                txt4.setText(tbl_detalles.getValueAt(filaSeleccionada, 3).toString());

                Object valorIva = tbl_detalles.getValueAt(filaSeleccionada, 4);
                if (valorIva != null) {
                    try {
                        double ivaNumerico = Double.parseDouble(valorIva.toString());
                        int ivaEntero = (int) ivaNumerico;
                        cbx1.setSelectedItem(String.valueOf(ivaEntero));
                    } catch (NumberFormatException ex) {
                        cbx1.setSelectedItem(valorIva.toString());
                    }
                }

                Object valorDescuento = tbl_detalles.getValueAt(filaSeleccionada, 5);
                if (valorDescuento != null) {
                    String descStr = valorDescuento.toString().trim().toLowerCase();
                    boolean activado = descStr.equals("true") || descStr.equals("t") || descStr.equals("si");
                    rb1.setSelected(activado);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al seleccionar fila: " + e.getMessage());
        }
    }

    //Revisar este codigo, al actualizar da error
    public void modificarDetalles(DetallesVentas detalles) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        String sql = "update detallesventas set id_producto = ?, cantidad = ?, precio_unitario_venta = ?, iva = ?::iva_enum, descuento = ? where id_producto = ? and id_venta = ?;";

        try {

            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);

            cs.setInt(1, detalles.getIdProducto());
            cs.setInt(2, detalles.getCantidad());
            cs.setDouble(3, detalles.getPrecioUnitario());
            cs.setInt(4, detalles.getIva());
            cs.setBoolean(5, detalles.isDescuento());
            cs.setInt(6, detalles.getIdProducto());
            cs.setInt(7, detalles.getIdVenta());

            System.out.println(cs);

            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error en update detallesVenta");
            e.printStackTrace();

        } finally {
            conexion.cerrarConexion();
        }
    }

    public void listarDetalles(JTable tbl_detalles, int id_venta) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = " select * from detallesventa where id_venta = ?;";

        modelo.addColumn("id_venta");
        modelo.addColumn("id_producto");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio_unitario_venta");
        modelo.addColumn("iva");
        modelo.addColumn("descuento");

        String datos[] = new String[6];

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            //PreparedStatement ps = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).createStatement();
            ps = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareStatement(sql);

            ps.setInt(1, id_venta);

            rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);

                modelo.addRow(datos);
            }

            tbl_detalles.setModel(modelo);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public boolean comprobarProducto(int idProducto) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        String sql = "select id_producto from productos where id_producto = ?";

        PreparedStatement ps;
        ResultSet rs;

        try {

            ps = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareStatement(sql);

            ps.setInt(1, idProducto);

            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
        return false;
    }

    public boolean comprobarExistenciaID(int idVentas, int idProducto) throws SQLException {

        String sql = "select id_venta, id_producto from detallesventa where id_venta = ? and id_producto = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = this.conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareStatement(sql);

            ps.setInt(1, idVentas);
            ps.setInt(2, idProducto);

            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception ignored) {
            }
            if (ps != null) try {
                ps.close();
            } catch (Exception ignored) {
            }

            this.conexion.cerrarConexion();
        }
        return false;
    }
}
