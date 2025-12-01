
package Dominio;

import DAO.Conexion_DB;
import Transversal.Productos;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DProducto {
    
    public void crearProducto(Productos producto) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "insert into productos (descripcion, marca, precioUnitario, codigo_Sku, codigo_Barras, estado, stock, stock_Max, stock_Min) values (?,?,?,?,?,?::estadoProductos_enum,?,?,?);";
        
        try{
            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);
            
            cs.setString(1, producto.getDescripcion());
            cs.setString(2, producto.getMarca());
            cs.setDouble(3, producto.getPrecioUnitario());
            cs.setString(4, producto.getCodigoSku());
            cs.setString(5, producto.getCodigoBarras());
            cs.setString(6, producto.getEstado());
            cs.setInt(7, producto.getStock());
            cs.setInt(8, producto.getStockMax());
            cs.setInt(9, producto.getStockMin());
            
            cs.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Error en insert producto: " + e.getMessage());
            e.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
    }
    
    public void listarProductos(JTable tbl_pro) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "select * from productos order by id_producto asc";
        
        modelo.addColumn("id_producto");
        modelo.addColumn("descripcion");
        modelo.addColumn("marca");
        modelo.addColumn("preciounitario");
        modelo.addColumn("codigo_sku");
        modelo.addColumn("codigo_barras");
        modelo.addColumn("estado");
        modelo.addColumn("stock");
        modelo.addColumn("stock_max");
        modelo.addColumn("stock_min");
        
        String datos[] = new String[10];
        
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
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                
                modelo.addRow(datos);
            }
            
            tbl_pro.setModel(modelo);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
    }
    
    public void seleccionarProducto(JTable tbl_pro, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JComboBox txt7, JTextField txt8, JTextField txt9, JTextField txt10){
        
        try{
            int filaSeleccionada = tbl_pro.getSelectedRow();
            
            if(filaSeleccionada >= 0){
                
                txt1.setText(tbl_pro.getValueAt(filaSeleccionada, 0).toString());
                txt2.setText(tbl_pro.getValueAt(filaSeleccionada, 1).toString());
                txt3.setText(tbl_pro.getValueAt(filaSeleccionada, 2).toString());
                txt4.setText(tbl_pro.getValueAt(filaSeleccionada, 3).toString());
                txt5.setText(tbl_pro.getValueAt(filaSeleccionada, 4).toString());
                txt6.setText(tbl_pro.getValueAt(filaSeleccionada, 5).toString());
                
                //sacamos los datos del comboBox
                Object valorComboBox = tbl_pro.getValueAt(filaSeleccionada, 6);
                txt7.setSelectedItem(valorComboBox);
                
                txt8.setText(tbl_pro.getValueAt(filaSeleccionada, 7).toString());
                txt9.setText(tbl_pro.getValueAt(filaSeleccionada, 8).toString());
                txt10.setText(tbl_pro.getValueAt(filaSeleccionada, 9).toString());
            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No hay fila seleccionada");
        }
    }
    
    public void modificarProducto(Productos producto) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "update productos set descripcion = ?, marca = ?, preciounitario = ?, codigo_sku = ?, codigo_barras = ?, estado = ?::estadoproductos_enum, stock = ?, stock_max = ?, stock_min = ? where id_producto = ?;";
        
        try{
            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);
            
            cs.setString(1, producto.getDescripcion());
            cs.setString(2, producto.getMarca());
            cs.setDouble(3, producto.getPrecioUnitario());
            cs.setString(4, producto.getCodigoSku());
            cs.setString(5, producto.getCodigoBarras());
            cs.setString(6, producto.getEstado());
            cs.setInt(7, producto.getStock());
            cs.setInt(8, producto.getStockMax());
            cs.setInt(9, producto.getStockMin());
            cs.setInt(10, producto.getIdProducto());
            
            System.out.println(cs);
            
            cs.execute();
        }catch(SQLException e){
            System.out.println("Error al modificar el producto");
            e.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
    }
}
