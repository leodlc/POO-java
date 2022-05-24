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
public class VehiculoTransporte extends Vehiculo {
    private double pasajeros;

    public VehiculoTransporte(double pasajeros, String matricula, double diasAlquiler) {
        super(matricula, diasAlquiler);
        this.pasajeros = pasajeros;
    }

    public double getPasajeros() {
        return pasajeros;
    }
    
    
    
    

    @Override
    public double precioAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
