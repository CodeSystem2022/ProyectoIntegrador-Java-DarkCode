
package Metodo_sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class ConexionDB {
    
    public static String URL = "jdbc:mysql://localhost:3306/databasedarkcode";
    public static String USUARIO = "root";
    public static String PASSWORD = "DARKCODE23";//DARKCODE23 
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
}
