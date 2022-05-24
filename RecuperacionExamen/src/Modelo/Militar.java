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
public class Militar extends Cliente implements IngresoClientes {
    private String codigoMilitar,estadoMilitar,gradoMilitar;

    public Militar(String codigoMilitar, String estadoMilitar, String gradoMilitar, String nombre, String empresa, String cedula, String telefono) {
        super(nombre, empresa, cedula, telefono);
        this.codigoMilitar = codigoMilitar;
        this.estadoMilitar = estadoMilitar;
        this.gradoMilitar = gradoMilitar;
    }

    
    public Militar(){
    }

    public String getCodigoMilitar() {
        return codigoMilitar;
    }

    public void setCodigoMilitar(String codigoMilitar) {
        this.codigoMilitar = codigoMilitar;
    }

    public String getEstadoMilitar() {
        return estadoMilitar;
    }

    public void setEstadoMilitar(String estadoMilitar) {
        this.estadoMilitar = estadoMilitar;
    }

    public String getGradoMilitar() {
        return gradoMilitar;
    }

    public void setGradoMilitar(String gradoMilitar) {
        this.gradoMilitar = gradoMilitar;
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
    public void ingresoCliente() {
       
    }

    @Override
    public void eliminarCliente() {
        
    }

    @Override
    public void registroClientes() {
        
    }
    
    
}
