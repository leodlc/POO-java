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
public abstract  class PujaAbstracta {
    protected double pujaRealizada=3000;
    protected String nombrePujador;

    public PujaAbstracta() {
    }
    

    public PujaAbstracta(double pujaRealizada, String nombrePujador) {
        this.pujaRealizada = pujaRealizada;
        this.nombrePujador = nombrePujador;
    }
    public String getNombrePujador() {
        return nombrePujador;
    }

    public void setNombrePujador(String nombrePujador) {
        this.nombrePujador = nombrePujador;
    }
    public abstract double getPujaRealizada();
    public abstract void setPujaRealizada(double pujaRealizada);
    
    
    
}
