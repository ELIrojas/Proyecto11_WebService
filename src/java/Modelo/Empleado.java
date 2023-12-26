
package Modelo;


public class Empleado {
     String dni;
     String pass;
     String apellidos;
     String nombres;
     String privilegios;

    public Empleado() {
    }

    public Empleado(String dni, String pass, String apellidos, String nombres, String privilegios) {
        this.dni = dni;
        this.pass = pass;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.privilegios = privilegios;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(String privilegios) {
        this.privilegios = privilegios;
    }
     
     
    
    
}
