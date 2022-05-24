/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorBicicletaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta mibici= new Bicicleta(3,6,9);
        mibici.acelerar();
        mibici.frenar();
        mibici.mostrarBicicleta();
        System.out.println("==================");
        System.out.println("Cambio:");
        System.out.println("==================");
        mibici.cambiarPlato(14);
        mibici.cambiarPñon(10);
        mibici.mostrarBicicleta();
        System.out.println("==================");
    }
    
}
