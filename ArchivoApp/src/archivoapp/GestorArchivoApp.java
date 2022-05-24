/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author AsrockLeo
 */
public class GestorArchivoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo; //manipular archivo
        FileWriter escribir; //escribir en archivo
        PrintWriter linea; //para escribir en el archivo
        archivo= new File("ejemploEscritura2.txt");
        try
        {
           escribir = new FileWriter(archivo,true);
           linea = new PrintWriter(escribir); 
           //Escribimos en el archivo
           linea.println("Hola a todos");
           linea.println("Es un gusto");
           linea.close();
           escribir.close();
        }catch(IOException ex)
        {
            //Logger.getLogger(Archivo2.class.getname()).log(Level.SEVERE,null,ex);
            ex.getStackTrace();
        }
    }
    
}
