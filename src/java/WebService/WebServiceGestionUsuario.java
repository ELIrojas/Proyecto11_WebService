
package WebService;

import Modelo.Empleado;
import Modelo.EmpleadoDao;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WebServiceGestionUsuario")
public class WebServiceGestionUsuario {

    /**
     * http://localhost:8080/Proyecto111/WebServiceGestionUsuario
     */
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "validarempleado")
    public Empleado consultaEmpleado(@WebParam(name = "dni") String dni,@WebParam(name = "pass") String pass, @WebParam(name = "privilegios") String privilegios){
        EmpleadoDao empleadoDao=new EmpleadoDao();
        Empleado empleado = empleadoDao.verificarConexion(dni, pass, privilegios);
        return empleado;
    }
    
    @WebMethod(operationName = "validarusuario")
    public Usuario consultaUsuario(@WebParam(name = "id") String id){
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuario = usuarioDao.verificarConexion(id);
        return usuario;
    }
}
