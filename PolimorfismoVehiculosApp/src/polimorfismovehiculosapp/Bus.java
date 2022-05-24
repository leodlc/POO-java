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
public class Bus extends VehiculoTransporte{

    public Bus(double pasajeros, String matricula, double diasAlquiler) {
        super(pasajeros, matricula, diasAlquiler);
    }
    

    @Override
    public double precioAlquiler() {
        return super.precioBase()+super.getPasajeros()*2;
    }
    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Pasajeros: "+super.getPasajeros());
    }
    
}
