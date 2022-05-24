/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correexamenapp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class GestorCorreExamenApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el codigo de cliente");
        int codigo= sc.nextInt();
        System.out.println("Ingrese el nombre del cliente");
        String nombre= sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el numero de cuenta de cliente");
        String numCuenta= sc.nextLine();
        
        System.out.println("Ingrese el numero la direccion de cliente");
        String direccion=sc.nextLine();
        
        System.out.println("Ingrese el numero el telefono de cliente");
        String telefono=sc.nextLine();
        System.out.println("---------------------------------------------------------");
        System.out.println("Ingrese el codigo de mascota");
        int codigoMascota= sc.nextInt();
        System.out.println("Ingrese la raza de la mascota");
        String raza= sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el color de pelo");
        String colorPelo= sc.nextLine();
        
        System.out.println("Ingrese el numero la fecha de nacimiento");
        String nacimientoMascota=sc.nextLine();
        
        System.out.println("Ingrese el peso medio de la mascota");
        float pesoMed=sc.nextFloat();
        System.out.println("Ingrese el peso actual de la mascota");
        float pesoActual=sc.nextFloat();
        
        Cliente cliente1 = new Cliente(codigo, nombre,numCuenta,direccion,telefono);
        Mascota mascota1 = new Mascota(codigoMascota,raza,colorPelo,nacimientoMascota,pesoMed,pesoActual);
        //cliente1.toString();
        System.out.println(cliente1);
        
        
        

    }
    
}
