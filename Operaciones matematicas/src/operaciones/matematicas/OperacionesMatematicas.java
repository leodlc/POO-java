/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.matematicas;

/**
 *
 * @author AsrockLeo
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1= 6;
        int numero2= 8;
        int numero3= 5;
        int numero4= 4;
        
        System.out.println(numero1 + numero2 / numero3 * numero4);
        
        //potenciaciones
        double potencia = Math.pow(2,6);
        System.out.println(potencia);
        
        //operadores de asignacion
        int uno = 6;
        uno += uno;
        System.out.println(uno);
        
        /*operadores relacionales
        !=  Es distinto de
        == es igual que
        */
        
    }
    
}
