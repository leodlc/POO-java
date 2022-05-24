/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ethan, alex, valen
 */
public class Archivo {
    
    public void escribir(ArrayList<NuevoProducto> Productos) {

        PrintWriter salida = null;
        try {
            // escritura de datos
            salida = new PrintWriter(new BufferedWriter(new FileWriter("Inventario.txt")));
            for (int i = 0; i < Productos.size(); i++) {
                salida.println(Productos.get(i).getNombreP() + "-" + Productos.get(i).getCodigo()+ "-" + Productos.get(i).getCantidadCU() + "-" + Productos.get(i).getUnidades());
            }
            salida.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Datos no Compatibles");
        } finally {
            salida.close();
        }

    }
    

    public ArrayList<NuevoProducto> leer() {
        ArrayList<NuevoProducto> Productos = new ArrayList<>();

        try {


            //lectura de datos
            BufferedReader entrada = new BufferedReader(new FileReader("Inventario.txt"));
            String s, s2 = new String();
            String NombreP;
            String Codigo;
            String CantidadCU;
            int unidades;
            while ((s = entrada.readLine()) != null) {
                s2 += s + "\n";
                String[] informacion = s.split("-");
                NombreP = informacion[0];
                Codigo = informacion[1];
                CantidadCU = informacion[2];
                unidades = Integer.parseInt(informacion[3]);
                NuevoProducto objProducto = new NuevoProducto(NombreP,Codigo,CantidadCU,unidades) ;             
                Productos.add(objProducto);
            }
            System.out.println("Productos en Base de Datos:" + "\n" + s2);
            entrada.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "El Producto no se encuentra en la Base");
        }
        return Productos;
    }
    

}
