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
public class Participante {
    protected double pujaAportada;
    protected String nombre;

    public Participante() {
    }

    public Participante(double pujaAportada, String nombre) {
        this.pujaAportada = pujaAportada;
        this.nombre = nombre;
    }

    public double getPujaAportada() {
        return pujaAportada;
    }

    public void setPujaAportada(double pujaAportada) {
        this.pujaAportada = pujaAportada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Participante{" + "pujaAportada=" + pujaAportada + ", nombre=" + nombre + '}';
    }
    
    
}
