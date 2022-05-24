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
public class Puja extends PujaAbstracta {
    protected double pujaInicial;
    
    public Puja(double pujaInicial, double pujaRealizada, String nombrePujador) {
        super(pujaRealizada, nombrePujador);
        this.pujaInicial = pujaInicial;
    }
    public Puja() {
    }

    public String getNombrePujador() {
        return nombrePujador;
    }

    public void setNombrePujador(String nombrePujador) {
        this.nombrePujador = nombrePujador;
    }
    
    public double getPujaInicial() {
        return pujaInicial;
    }

    public void setPujaInicial(double pujaInicial) {
        this.pujaInicial = pujaInicial;
    }
    

    @Override
    public double getPujaRealizada() {
        return pujaRealizada+pujaInicial;
    }

    @Override
    public void setPujaRealizada(double pujaRealizada) {
        
        this.pujaRealizada=pujaRealizada;
        
        
    }


    
}
