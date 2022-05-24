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
public class Puja {
    protected double pujaInicial=1000;

    public Puja() {
    }

    public double getPujaInicial() {
        return pujaInicial;
    }

    public void setPujaInicial(double pujaInicial) {
        this.pujaInicial = pujaInicial;
    }

    @Override
    public String toString() {
        return "Puja{" + "pujaInicial=" + pujaInicial + '}';
    }
    
}
