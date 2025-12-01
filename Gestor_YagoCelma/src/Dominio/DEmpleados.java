package Dominio;

import DAO.Conexion_DB;
import Transversal.Empleado;
import com.toedter.calendar.JDateChooser;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DEmpleados {

    Conexion_DB conexion = new Conexion_DB();

    public void crearEmpleado(Empleado empleado) throws SQLException {

        String sql = "insert into empleados (nombre, apellido1, apellido2, dni, sueldo, puesto, calle, codigo_Postal, ciudad, provincia, pais, id_empresa, correo, iban, fecha_Nacimiento, departamento, fecha_Contratacion, activo) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);

            cs.setString(1, empleado.getNombre());
            cs.setString(2, empleado.getApellido1());
            cs.setString(3, empleado.getApellido2());
            cs.setString(4, empleado.getDni());
            cs.setDouble(5, empleado.getSueldo());
            cs.setString(6, empleado.getPuesto());
            cs.setString(7, empleado.getCalle());
            cs.setString(8, empleado.getCodigoPostal());
            cs.setString(9, empleado.getCiudad());
            cs.setString(10, empleado.getProvincia());
            cs.setString(11, empleado.getPais());
            cs.setInt(12, empleado.getIdEmpresa());
            cs.setString(13, empleado.getCorreo());
            cs.setString(14, empleado.getIban());
            cs.setDate(15, new java.sql.Date(empleado.getFechaNacimiento().getTime()));
            cs.setString(16, empleado.getDepartamento());
            cs.setDate(17, new java.sql.Date(empleado.getFechaContratacion().getTime()));
            cs.setBoolean(18, empleado.isActivo());

            System.out.println(cs);

            cs.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en insert cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }
    }

    public void listarEmpleados(JTable tbl_emp) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "select * from empleados order by id_empleado asc;";

        modelo.addColumn("id_empleado");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido1");
        modelo.addColumn("apellido2");
        modelo.addColumn("dni");
        modelo.addColumn("sueldo");
        modelo.addColumn("puesto");
        modelo.addColumn("calle");
        modelo.addColumn("codigo_postal");
        modelo.addColumn("ciudad");
        modelo.addColumn("provincia");
        modelo.addColumn("pais");
        modelo.addColumn("id_empresa");
        modelo.addColumn("correo");
        modelo.addColumn("iban");
        modelo.addColumn("fecha_nacimiento");
        modelo.addColumn("departamento");
        modelo.addColumn("fecha_contratacion");
        modelo.addColumn("activo");

        String datos[] = new String[19];

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
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                datos[15] = rs.getString(16);
                datos[16] = rs.getString(17);
                datos[17] = rs.getString(18);
                datos[18] = rs.getString(19);

                modelo.addRow(datos);
            }

            tbl_emp.setModel(modelo);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }

    }

    public void seleccionarEmpleado(JTable tbl_emp, JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7, JTextField txt8, JTextField txt9, JTextField txt10, JTextField txt11, JTextField txt12, JTextField txt13, JTextField txt14, JTextField txt15, JDateChooser dch16, JTextField txt17, JDateChooser dch18, JRadioButton rbt19) {

        try {
            int filaSeleccionada = tbl_emp.getSelectedRow();

            if (filaSeleccionada >= 0) {

                txt1.setText(tbl_emp.getValueAt(filaSeleccionada, 0).toString());
                txt2.setText(tbl_emp.getValueAt(filaSeleccionada, 1).toString());
                txt3.setText(tbl_emp.getValueAt(filaSeleccionada, 2).toString());
                txt4.setText(tbl_emp.getValueAt(filaSeleccionada, 3).toString());
                txt5.setText(tbl_emp.getValueAt(filaSeleccionada, 4).toString());
                txt6.setText(tbl_emp.getValueAt(filaSeleccionada, 5).toString());
                txt7.setText(tbl_emp.getValueAt(filaSeleccionada, 6).toString());
                txt8.setText(tbl_emp.getValueAt(filaSeleccionada, 7).toString());
                txt9.setText(tbl_emp.getValueAt(filaSeleccionada, 8).toString());
                txt10.setText(tbl_emp.getValueAt(filaSeleccionada, 9).toString());
                txt11.setText(tbl_emp.getValueAt(filaSeleccionada, 10).toString());
                txt12.setText(tbl_emp.getValueAt(filaSeleccionada, 11).toString());
                txt13.setText(tbl_emp.getValueAt(filaSeleccionada, 12).toString());
                txt14.setText(tbl_emp.getValueAt(filaSeleccionada, 13).toString());
                txt15.setText(tbl_emp.getValueAt(filaSeleccionada, 14).toString());

                String fechaTexto1 = tbl_emp.getValueAt(filaSeleccionada, 15).toString();
                String fechaTexto2 = tbl_emp.getValueAt(filaSeleccionada, 17).toString();

                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // ajusta al formato que uses
                java.util.Date fecha1 = formato.parse(fechaTexto1);
                java.util.Date fecha2 = formato.parse(fechaTexto2);

                dch16.setDate(fecha1);
                dch18.setDate(fecha2);

                txt17.setText(tbl_emp.getValueAt(filaSeleccionada, 16).toString());
                rbt19.setText(tbl_emp.getValueAt(filaSeleccionada, 18).toString());

            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No hay fila seleccionada");
        }
    }

    public void modificarEmpleados(Empleado empleado) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        String sql = "update empleados set nombre = ?, apellido1 = ?, apellido2 = ?, dni = ?, sueldo = ?, puesto = ?, calle = ?, codigo_postal = ?, ciudad = ?, provincia = ?, pais = ?, id_empresa = ?, correo = ?, iban = ?, fecha_nacimiento = ?, departamento = ?, fecha_contratacion = ?, activo = ? where id_empleado = ?";

        try {

            CallableStatement cs = conexion.getConexion(ManagerDB.getCadena(), ManagerDB.USER, ManagerDB.PASSWORD).prepareCall(sql);

            cs.setString(1, empleado.getNombre());
            cs.setString(2, empleado.getApellido1());
            cs.setString(3, empleado.getApellido2());
            cs.setString(4, empleado.getDni());
            cs.setDouble(5, empleado.getSueldo());
            cs.setString(6, empleado.getPuesto());
            cs.setString(7, empleado.getCalle());
            cs.setString(8, empleado.getCodigoPostal());
            cs.setString(9, empleado.getCiudad());
            cs.setString(10, empleado.getProvincia());
            cs.setString(11, empleado.getPais());
            cs.setInt(12, empleado.getIdEmpresa());
            cs.setString(13, empleado.getCorreo());
            cs.setString(14, empleado.getIban());

            java.sql.Date fechaNacSQL = new java.sql.Date(empleado.getFechaNacimiento().getTime());
            cs.setDate(15, fechaNacSQL);

            java.sql.Date fechaConSQL = new java.sql.Date(empleado.getFechaContratacion().getTime());
            cs.setDate(17, fechaConSQL);

            cs.setString(16, empleado.getDepartamento());
            cs.setBoolean(18, empleado.isActivo());
            cs.setInt(19, empleado.getIdEmpleado());
            
            System.out.println(cs);
            
            cs.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el empleado", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }finally {
        conexion.cerrarConexion();
        }
    }
}
