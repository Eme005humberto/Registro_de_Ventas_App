/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author Emerson Humberto
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/aplicacion_practica?useServerTimezone=true&serverTimezone=UTC";
    
    private static Connection conexion = null;
    
    public static Connection conectarse(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conexion Exitosa!!");
        }catch(Exception ex){
              System.out.println("Error al conectarse a la BD " + ex);
        }
        return conexion;
    }
     
    // Metodos para cerrar conexion
    public static void close(Connection conn){
        try{
            conn.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void close(ResultSet rs){
        try{
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt){
        try{
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
