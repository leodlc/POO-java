/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoapp;

/**
 *
 * @author AsrockLeo
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    
    
    //csontructores
    public Empleado() 
    {
        this.nombre="";
        this.apellido="";
        this.salarioMensual=0;
    }
    public Empleado(String nombre,String apellido, double salarioMensual){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salarioMensual=salarioMensual;
        if(salarioMensual<0){
            this.salarioMensual=0;
        }else{
            this.salarioMensual=salarioMensual;
        }
    }
    public void mostrarEmpleado()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Salario: " + salarioMensual);
    }
    
    public double getSalario(){
        return salarioMensual;
        
    }
    public void salarioAnual()
    {
        salarioMensual *=12;
        
    }
    public void aumentarSalario()
    {
        salarioMensual= (salarioMensual*110)/100;
    }
    public void setSalario(double salarioMensual){
        this.salarioMensual=salarioMensual;
    }
    
    
}
