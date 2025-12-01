package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion_DB {
    
    Connection conexion = null;

    public Connection getConexion(String url, String USER, String PASSWORD){
        
        try {
            Class.forName("org.postgresql.Driver");
            
            
            conexion = (Connection) DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Conexion establecida");
            
        } catch (Exception ex) {
            System.getLogger(Conexion_DB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return conexion;
    }
    
        public void cerrarConexion() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}


