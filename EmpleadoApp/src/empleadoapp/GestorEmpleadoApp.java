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
public class GestorEmpleadoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1= new Empleado("Fernando","Suarez",600);
        Empleado emp2= new Empleado("Marco","Castillo",-460);
        emp1.mostrarEmpleado();
        //emp1.getSalario();
        
        System.out.println("------Salario anual: " );
        emp1.getSalario();
        emp1.salarioAnual();
        emp1.aumentarSalario();
        emp1.mostrarEmpleado();
        System.out.println("============================================== " );
        System.out.println("Poner salario");
        emp1.setSalario(300);
        emp1.mostrarEmpleado();
        System.out.println("============================================== " );
        emp2.mostrarEmpleado();
        System.out.println("Poner salario: ");
        emp2.setSalario(460);
        emp2.getSalario();
        emp2.salarioAnual();
        emp2.aumentarSalario();
        emp2.mostrarEmpleado();
    }
    
}
