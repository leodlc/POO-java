/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariaapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorCuentaBancariaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Activa",1400);
        System.out.println(cuenta1.getsaldoAct());
        
    }
    
}
