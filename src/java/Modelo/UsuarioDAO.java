
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDAO {
    
    private ConexionBD con;
     
    public UsuarioDAO(){
        con =new ConexionBD();
    }
    
    public Usuario verificarConexion(String id){
        Usuario usuario = null;
        Connection accesoBD = con.ConexionMysql();
        String sql = "select*from usuario where id=?";
        try {
            PreparedStatement ps = accesoBD.prepareCall(sql);
            ps.setString(0, id);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                usuario = new Usuario();
                usuario.setId(rs.getInt(1));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }
    
}
