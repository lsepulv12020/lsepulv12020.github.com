
package Modelo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    Connection con;
    private String user = "root";
    private String pass = "12345678";
    private String host  = "localhost";
    private String puerto = "3306";
    private String dataBase = "bd_ges_per";
    private String className = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+host+":"+puerto+"/"+dataBase;
    
    public Conexion() {
        try {

            Class.forName(className);
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR: " + e);
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }
    
    public Connection getConnection(){
    
        return con;
    
    }
    
}
