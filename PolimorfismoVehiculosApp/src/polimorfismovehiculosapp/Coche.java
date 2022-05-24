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
public class Coche extends VehiculoTransporte {

    public Coche(double pasajeros, String matricula, double diasAlquiler) {
        super(pasajeros, matricula, diasAlquiler);
    }
    @Override
    public double precioAlquiler() {
        return super.precioBase()+2*super.getPasajeros()*super.getDiasAlquiler();
    }
    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Pasajeros: "+super.getPasajeros());
    }
    

    
    

    
      
}
