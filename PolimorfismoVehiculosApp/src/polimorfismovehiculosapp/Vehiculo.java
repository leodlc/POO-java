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
public abstract class Vehiculo {
    private String matricula;
    private double diasAlquiler;

    public Vehiculo(String matricula, double diasAlquiler) {
        this.matricula = matricula;
        this.diasAlquiler = diasAlquiler;
    }
    

    

    public String getMatricula() {
        return matricula;
    }

    public double getDiasAlquiler() {
        return diasAlquiler;
    }

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDiasAlquiler(double diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    

    public double precioBase(){
        return 50*diasAlquiler;
    }
    public void mostrarInfoVehiculo(){
        System.out.println("Matricla: "+ matricula);
        System.out.println("Dias de Alquiler: "+ diasAlquiler);
    }
    
    public abstract double precioAlquiler();
    
    
}
