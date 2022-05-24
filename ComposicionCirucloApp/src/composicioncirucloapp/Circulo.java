/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncirucloapp;

/**
 *
 * @author AsrockLeo
 */
public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo() {
    }

    
    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public Circulo(int x, int y, int radio) {
        this.centro = new Punto(x,y);
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public int getRadio() {
        return radio;
    }
    public double CalcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    public void DesplazarCentro(int desplazarx,int desplazary){
        centro.desplazarX(desplazarx);
        centro.desplazarY(desplazary);
    }
    public double calcularPerimetro(){
        return Math.PI*2*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "centro=" + centro + ", radio=" + radio + '}';
    }
    
    
    
}
