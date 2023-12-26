
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class EmpleadoDao {
    
     private ConexionBD con;
     
    public EmpleadoDao(){
        con =new ConexionBD();
    }
    
    public Empleado verificarConexion(String dni, String pass, String privilegios){
        Empleado empleado = null;
        Connection accesoBD = con.ConexionMysql();
        String sql = "select*from empleado where dni=? and pass=? and privilegios=?";
        try {
            PreparedStatement ps = accesoBD.prepareCall(sql);
            ps.setString(0, dni);
            ps.setString(1, pass);
            ps.setString(2, privilegios);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                empleado = new Empleado();
                empleado.setDni(rs.getString(1));
                empleado.setPass(rs.getString(2));
                empleado.setApellidos(rs.getString(3));
                empleado.setNombres(rs.getString(4));
                empleado.setPrivilegios(rs.getString(5));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empleado;
    }
    
}
