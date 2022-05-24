/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetallerapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class PiezaCompuesta extends PiezaAbstracta {
    protected String descripcion;
    protected PiezaSimple tornillo;

    public PiezaCompuesta(String descripcion,PiezaSimple tornillo, String nombre, double precio) {
        super(nombre, precio);
        this.descripcion = descripcion;
        this.tornillo=tornillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PiezaSimple getTornillo() {
        return tornillo;
    }

    public void setTornillo(PiezaSimple tornillo) {
        this.tornillo = tornillo;
    }
    
    

    @Override
    public double getPrecio() {
       //PiezaSimple tornillo= new PiezaSimple("Tornillo ACME 15",0.21);
       //precio+=tornillo.precio;
       return precio;
    }

    @Override
    public void setPrecio(double precio) {
        
        this.precio=precio;
    }
    
    
}
