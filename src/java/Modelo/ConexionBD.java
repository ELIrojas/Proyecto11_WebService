package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static Connection ConexionMysql(){
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_prueba","root","alessio123");
            System.out.println("Conexion correcta a la BD");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }
     public static void main(String[]args){
            ConexionMysql();
  }
}
