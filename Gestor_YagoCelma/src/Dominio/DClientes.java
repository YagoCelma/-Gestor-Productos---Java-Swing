package Dominio;

import DAO.Conexion_DB;
import Transversal.Cliente;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DClientes {

    //INSERTAR CLIENTES
    public void crearClientes(Cliente cliente) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        String sql = "insert into clientes (nombre, razon_comercial, nif, correo, telefono, tipo_pago, direccion_facturacion, direccion_envio)values (?,?,?,?,?,?::tipo_pago_enum,?,?);";

        try {

            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);

            cs.setString(1, cliente.getNombre());
            cs.setString(2, cliente.getRazonComercial());
            cs.setString(3, cliente.getNif());
            cs.setString(4, cliente.getCorreo());
            cs.setString(5, cliente.getTelefono());
            cs.setString(6, cliente.getTipoPago());
            cs.setString(7, cliente.getDireccionFacturacion());
            cs.setString(8, cliente.getDireccionEnvio());

            cs.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en insert cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public void listarClientes(JTable tbl_cli) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "select * from clientes order by id_cliente asc";

        modelo.addColumn("id_cliente");
        modelo.addColumn("nombre");
        modelo.addColumn("razon_comercial");
        modelo.addColumn("nif");
        modelo.addColumn("correo");
        modelo.addColumn("telefono");
        modelo.addColumn("tipo_pago");
        modelo.addColumn("direccion_facturacion");
        modelo.addColumn("direccion_envio");

        String datos[] = new String[9];

        Statement st;

        try {

            st = (Statement) conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);

                modelo.addRow(datos);
            }

            tbl_cli.setModel(modelo);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public void seleccionarCliente(JTable tbl_cli, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JComboBox cbx1, JTextField txt7, JTextField txt8) {

        try {
            int filaSeleccionada = tbl_cli.getSelectedRow();

            if (filaSeleccionada >= 0) {
                txt1.setText(tbl_cli.getValueAt(filaSeleccionada, 0).toString());
                txt2.setText(tbl_cli.getValueAt(filaSeleccionada, 1).toString());
                txt3.setText(tbl_cli.getValueAt(filaSeleccionada, 2).toString());
                txt4.setText(tbl_cli.getValueAt(filaSeleccionada, 3).toString());
                txt5.setText(tbl_cli.getValueAt(filaSeleccionada, 4).toString());

                Object valorComboBox = tbl_cli.getValueAt(filaSeleccionada, 6);
                cbx1.setSelectedItem(valorComboBox);

                txt6.setText(tbl_cli.getValueAt(filaSeleccionada, 5).toString());
                txt7.setText(tbl_cli.getValueAt(filaSeleccionada, 7).toString());
                txt8.setText(tbl_cli.getValueAt(filaSeleccionada, 8).toString());
            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No hay fila seleccionada");
        }
    }

    public void modificarClientes(Cliente cliente) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        String sql = "update clientes set nombre = ?, razon_comercial = ?, nif = ?, correo = ?, telefono = ?, tipo_pago = ?::tipo_pago_enum ,direccion_facturacion = ?, direccion_envio = ? where id_cliente = ?;";

        try {

            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);

            cs.setString(1, cliente.getNombre());
            cs.setString(2, cliente.getRazonComercial());
            cs.setString(3, cliente.getNif());
            cs.setString(4, cliente.getCorreo());
            cs.setString(5, cliente.getTelefono());
            cs.setString(6, cliente.getTipoPago());
            cs.setString(7, cliente.getDireccionFacturacion());
            cs.setString(8, cliente.getDireccionEnvio());
            cs.setInt(9, cliente.getIdCliente());

            System.out.println(cs);

            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error en update cliente");
            e.printStackTrace();

        } finally {
            conexion.cerrarConexion();
        }
    }

    public boolean existeNif(String nif) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();
        String sql = "SELECT COUNT(*) FROM clientes WHERE nif = ?";

        CallableStatement cs = null;
        ResultSet rs = null;

        try {

            cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);
            cs.setString(1, nif);
            rs = cs.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }

            return false;

        } catch (SQLException e) {
            System.out.println("Error al comprobar duplicidad de NIF: " + e.getMessage());
            throw e;
        } finally {

            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            conexion.cerrarConexion();
        }
    }

}
