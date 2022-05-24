/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionnumeroapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AsrockLeo
 */
public class GestorExcepcionNumeroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de dato por teclado
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        try
        {
           System.out. println("Ingrese calificacion");
           int valor = Integer.parseInt(br.readLine());
           validarCalificacion(valor);
           System.out.println("Valor ingresado" + valor);
        }
        catch(Exception ex)
        {
            ex.printStackTrace(); //captura excepcion global
            //System.out.println("Mal Ingreso");
        }
        
    }
     public static void validarCalificacion(int valor)throws ExcepcionCalificacion{
        if(valor<1 || valor >20){
            throw new ExcepcionCalificacion("--Numero fuera de rango--");
        }
    }
    
}
