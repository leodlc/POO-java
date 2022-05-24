/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

/**
 *
 * @author AsrockLeo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Conversion de tipos de variables cadenas a enteros
        String numero = "40";
       int numeroEntero = Integer.parseInt(numero);
       /*
       System.out.println("mi variable es de tipo " +  ((Object)numeroEntero).getClass().getSimpleName());
       con esta funcion obtenemos el tipo de variable
       */
       System.out.println(numeroEntero);
       int numero2 = 5 ;
       int suma = numeroEntero + numero2 ;
       System.out.println(suma);
       
       // conversion de string a double
       
       double numerodouble = Double.parseDouble(numero);
       System.out.println(numerodouble);
       
       // entero a string
       String numero_string = Integer.toString(numero2);
       System.out.println("mi variable " + (numero_string)+ " es De tipo " +  ((Object)numero_string).getClass().getSimpleName());
       
       //conversion char a string
       char letra = 'h';
       System.out.println(letra);
       String palabra = Character.toString(letra);
       System.out.println("mi variable " + (palabra)+ " es De tipo " +  ((Object)palabra).getClass().getSimpleName());
       
       // conversion de string a char
       String palabra2= "Mi nombres es Leonardo De La Cadena";
       char letra2 = palabra2.charAt(0);
       System.out.println(letra2);
       
     
       
       
       
       
       
       
       
       
       
      
       
       
       
       
       
       
    }
    
}
