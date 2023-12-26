/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author yaque
 */
public class Usuario {
        int id;
        Empleado dni_empleado;
        String telefono;
        String direccion;

    public Usuario() {
    }

    public Usuario(int id, Empleado dni_empleado, String telefono, String direccion) {
        this.id = id;
        this.dni_empleado = dni_empleado;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getDni_empleado() {
        return dni_empleado;
    }

    public void setDni_empleado(Empleado dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
        
        
}
