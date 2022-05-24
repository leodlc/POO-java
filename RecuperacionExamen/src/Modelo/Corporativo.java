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
public class Corporativo extends Cliente implements IngresoClientes  {
    private String idEmpresa;

    public Corporativo(String idEmpresa, String nombre, String empresa, String cedula, String telefono) {
        super(nombre, empresa, cedula, telefono);
        this.idEmpresa = idEmpresa;
    }

    public Corporativo() {
        
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
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
