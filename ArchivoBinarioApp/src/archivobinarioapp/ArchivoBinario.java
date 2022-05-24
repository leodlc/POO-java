/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivobinarioapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author AsrockLeo
 */
public class ArchivoBinario {
    public void escribir()
    {
        int edad=19;
        double precio=389.3;
        String nombre = "Eduardo";
        
        String nombreArchivo="datos_binarios.dat";
        try
        {
           OutputStream os = new FileOutputStream(nombreArchivo);
           DataOutputStream dos= new DataOutputStream(os);
           dos.writeInt(edad);
           dos.writeDouble(precio);
           dos.writeUTF(nombre);
           System.out.println("Escritura finalizada");
           dos.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void leer()
    {
        int edad;
        double precio;
        String nombre;
        
        String nombreArchivo="datos_binarios.dat";
        try
        {
            InputStream is= new FileInputStream(nombreArchivo);
            DataInputStream dis=new DataInputStream(is);
            while(true)
            {
                edad=dis.readInt();
                System.out.println("Edad: "+ edad);
                precio=dis.readDouble();
                System.out.println("Precio: "+ precio);
                nombre=dis.readUTF();
                System.out.println("Nombre: "+ nombre);
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
}
