/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorVeterinariaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc= new Scanner(System.in);
//        int codigoMascota,pesomed,pesoact;
//        String nombreMascota,raza,color,fecha;
//        System.out.println("Ingrese el codigo de la mascota");
//        codigoMascota=sc.nextInt();
//        System.out.println("Ingrese el nombre de la mascota");
//        nombreMascota=sc.nextLine();
//        System.out.println("Ingrese la raza de la mascota");
//        raza=sc.nextLine();
//        System.out.println("Ingrese el color de la mascota");
//        color=sc.nextLine();
//        System.out.println("Ingrese la fecha de nacimiento de la mascota");
//        fecha=sc.nextLine();
//        System.out.println("Ingrese el peso medio de la mascota");
//        pesomed=sc.nextInt();
//        System.out.println("Ingrese el peso actual de la mascota");
//        pesoact=sc.nextInt();
        
        Mascota mascota1= new Mascota(1,"Bobi","Snaurser","Cafe","24denero",30,40);
        //System.out.println(mascota1);
        Cliente cliente1=new Cliente(12,"Gerardo","13546","direccion","09845456",mascota1);
        System.out.println(cliente1.toString());
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("Calendario De Vacunacion.txt");
            try{
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            
            escribir.close();
            
            }catch(IOException ex){
                //Logger.gtLogger(Archivo2.class.getName()).log(Level.SEVERE, null, ex);
                ex.getStackTrace();
            }
        
        
    }
    
}
