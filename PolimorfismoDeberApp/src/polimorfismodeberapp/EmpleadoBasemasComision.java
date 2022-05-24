/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismodeberapp;

/**
 *
 * @author AsrockLeo
 */
public class EmpleadoBasemasComision extends EmpleadoPorComision {
    protected double salarioBase;

    public EmpleadoBasemasComision(double salarioBase, double ventasBrutas, double tarifaporComision, String nombre, int numeroSeguroSocial) {
        super(ventasBrutas, tarifaporComision, nombre, numeroSeguroSocial);
        this.salarioBase = salarioBase;
    }

    
    @Override
    public double calcularSalario() {
        return salarioBase+ventasBrutas*tarifaporComision;
    }

    
    
    

    

    
    
}
