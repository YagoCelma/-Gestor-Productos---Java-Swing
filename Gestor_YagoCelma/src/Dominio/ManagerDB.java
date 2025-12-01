package Dominio;


public class ManagerDB {
    
    public static String USER = "";
    public static String PASSWORD = "";
    
    public static String HOST = "localhost";
    public static String PUERTO = "5432";
    public static String DB = "Cesur_2025";
    
    
    public static String getCadena(){
        
        String url = "jdbc:postgresql://" + HOST + ":" + PUERTO + "/" + DB;
        return url;
    }
}
