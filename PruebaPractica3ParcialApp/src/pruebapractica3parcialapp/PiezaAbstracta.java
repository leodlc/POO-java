/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapractica3parcialapp;

/**
 *
 * @author AsrockLeo
 */
public abstract  class PiezaAbstracta {

    protected String nombre;
    protected double precio;
    protected double tiempo;

    public PiezaAbstracta(String nombre, double precio, double tiempo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double getPrecio();
    public abstract void setPrecio(double precio);
    public abstract double getTiempo();
    public abstract void setTiempo(double tiempo);
}
