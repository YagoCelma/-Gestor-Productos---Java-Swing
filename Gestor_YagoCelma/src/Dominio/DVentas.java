
package Dominio;

import DAO.Conexion_DB;
import Transversal.Ventas;
import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DVentas {
    
    public void crearVenta(Ventas venta) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "insert into ventas (id_cliente, fecha_compra, tipo_pago, fecha_entrega, estado) values (?,?,?::tipo_pago_enum,?,?::estado_enum);";
        
        try{
            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);
            
            cs.setInt(1, venta.getIdCliente());
            cs.setDate(2, new java.sql.Date(venta.getFechaCompra().getTime()));
            cs.setString(3, venta.getTipoPago());
            cs.setDate(4, new java.sql.Date(venta.getFechaEntrega().getTime()));
            cs.setString(5, venta.getEstado());
            
            cs.execute();
        }catch(SQLException e){
            System.out.println("Error en insert producto: " + e.getMessage());
            e.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
    }
    
    public void listarVentas(JTable tbl_venta) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "select * from ventas order by id_ventas asc";
        
        modelo.addColumn("id_ventas");
        modelo.addColumn("id_cliente");
        modelo.addColumn("fecha_compra");
        modelo.addColumn("tipo_pago");
        modelo.addColumn("fecha_entrega");
        modelo.addColumn("estado");
        
        String datos[] = new String[6];
        
        Statement st;
        
        try{
            
            st = (Statement) conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                
                modelo.addRow(datos);
            }
            tbl_venta.setModel(modelo);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
    }
    
    public void seleccionarVenta(JTable tbl_venta, JTextField txt1, JTextField txt2, JDateChooser dch1, JComboBox txt3, JDateChooser dch2, JComboBox txt4){
        
        try{
            int filaSeleccionada = tbl_venta.getSelectedRow();
            
            if(filaSeleccionada >= 0){
                txt1.setText(tbl_venta.getValueAt(filaSeleccionada, 0).toString());
                txt2.setText(tbl_venta.getValueAt(filaSeleccionada, 1).toString());
                
                //Para el formato fecha
                try{
                    String fechaTexto1 = tbl_venta.getValueAt(filaSeleccionada, 2).toString();
                    String fechaTexto2 = tbl_venta.getValueAt(filaSeleccionada, 4).toString();

                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

                    java.util.Date fecha1 = formato.parse(fechaTexto1);
                    java.util.Date fecha2 = formato.parse(fechaTexto2);

                    dch1.setDate(fecha1);
                    dch2.setDate(fecha2);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error con el formato fecha", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                try{
                    Object valorComboBox1 = tbl_venta.getValueAt(filaSeleccionada, 3);
                    txt3.setSelectedItem(valorComboBox1);
                    Object valorComboBox2 = tbl_venta.getValueAt(filaSeleccionada, 5);
                    txt4.setSelectedItem(valorComboBox2);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error con el formato enum", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No hay fila seleccionada");
        }
    }
    
    public void modificarVentas(Ventas venta) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "update ventas set id_cliente = ?, fecha_compra = ?, tipo_pago = ?::tipo_pago_enum, fecha_entrega = ?, estado = ?::estado_enum where id_ventas = ?;";
        
        try{
            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);
            
            cs.setInt(1, venta.getIdCliente());
            cs.setDate(2, new java.sql.Date(venta.getFechaCompra().getTime()));
            cs.setString(3, venta.getTipoPago());
            cs.setDate(4, new java.sql.Date(venta.getFechaEntrega().getTime()));
            cs.setString(5, venta.getEstado());
            cs.setInt(6, venta.getIdVenta());
            
            System.out.println("--- INTENTANDO ACTUALIZAR ---");
        System.out.println("ID Venta (WHERE): " + venta.getIdVenta());
        System.out.println("Nuevo ID Cliente: " + venta.getIdCliente());
        System.out.println("Sentencia: " + cs.toString());
            
            System.out.println(cs);
            cs.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error al modificar el cliente");
            e.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
    }
}
