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
public class Pieza extends PiezaAbstracta {
    protected int numeroPieza;
    protected String marca;

    public Pieza(int numeroPieza, String marca, String nombre, double precio, double tiempo) {
        super(nombre, precio, tiempo);
        this.numeroPieza = numeroPieza;
        this.marca = marca;
    }
    

    

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio=precio;
    }

    @Override
    public double getTiempo() {
        return tiempo;
    }

    @Override
    public void setTiempo(double tiempo) {
        this.tiempo=tiempo;
    }
    
}
