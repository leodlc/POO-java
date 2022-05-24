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
public class VehiculoCarga extends Vehiculo {
    private double numeroLlantas;

    public VehiculoCarga(double numeroLlantas, String matricula, double diasAlquiler) {
        super(matricula, diasAlquiler);
        this.numeroLlantas = numeroLlantas;
    }

    public double getNumeroLlantas() {
        return numeroLlantas;
    }
    
    
   

    

   
    
    

    
    

    @Override
    public double precioAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
