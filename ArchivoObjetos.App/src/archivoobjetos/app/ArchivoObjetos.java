/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoobjetos.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author AsrockLeo
 */
public class ArchivoObjetos {
    public void escribir()
    {
        File archivo;
        FileOutputStream fos;
        ObjectOutputStream salida;
        
        archivo=new File("archivoBinario.bin");
        try
        {
            fos = new FileOutputStream(archivo);
            salida= new ObjectOutputStream(fos);
            Alumno a1 = new Alumno("Ana","123",17);
            salida.writeObject(a1);
            Alumno a2= new Alumno("Pedro","456",16);
            salida.writeObject(a2);
            Alumno a3= new Alumno("Luis","789",18);
            salida.writeObject(a3);
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            
        }
    }
    public void leer()
    {
        File archivo;
        FileInputStream fis;
        ObjectInputStream entrada;
        archivo=new File("archivoBinario.bin");
        try
        {
            fis= new FileInputStream(archivo);
            entrada = new ObjectInputStream(fis);
            while(true)
            {
                Object dato= entrada.readObject();
                Alumno aux=(Alumno)dato;
                System.out.println("Nombre: "+aux.getNombre());
                System.out.println("DNI: "+aux.getDni());
                System.out.println("Nota: "+aux.getNota());
            }
        }
        catch(FileNotFoundException ex)
        {
            
        }
        catch(IOException ex)
        {
            
        }
        catch(ClassNotFoundException ex)
        {
            
        }
    }
    
}
