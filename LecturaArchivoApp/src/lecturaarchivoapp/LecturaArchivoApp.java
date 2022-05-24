/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaarchivoapp;

import java.io.File;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class LecturaArchivoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo =new File("/Users/Asrock/Documents/NetBeansProjects/LecturaArchivoApp/fichero.txt");
        try
        {
            FileReader fr=new FileReader(archivo);
            Scanner ingreso=new Scanner(fr);
            ingreso.useLocale(Locale.ENGLISH);
            while(ingreso.hasNext())
            {
                String palabra=ingreso.next();
                System.out.println("Palabra: "+palabra );
                while (ingreso.hasNextDouble())
                {
                    double d = ingreso.nextDouble();
                    System.out.println("Numero: "+ d);
                }
            }
        }
        catch(Exception ex)
        {
            ex.getStackTrace();
        } 
        
            
        
    }
    
}
