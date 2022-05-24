/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author AsrockLeo
 */
public class Cliente implements IngresoClientes {
    protected String nombre,empresa,cedula,telefono;

    public Cliente(String nombre, String empresa, String cedula, String telefono) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", empresa=" + empresa + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }

    @Override
    public void ingresoCliente() {
       
    }

    @Override
    public void eliminarCliente() {
        
    }

    @Override
    public void registroClientes() {
        
    }
    
}
