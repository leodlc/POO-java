/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismovehiculosapp;

/**
 *
 * @author AsrockLeo
 */
public class Trailer extends VehiculoCarga {

    public Trailer(double numeroLlantas, String matricula, double diasAlquiler) {
        super(numeroLlantas, matricula, diasAlquiler);
    }
    @Override
    public double precioAlquiler() {
        return super.precioBase()+20*super.getNumeroLlantas();
    }
    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Llantas: "+super.getNumeroLlantas());
    }
    
}
