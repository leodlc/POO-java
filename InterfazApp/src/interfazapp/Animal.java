/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazapp;

/**
 *
 * @author AsrockLeo
 */
public class Animal implements AccionesGeneral {

    @Override
    public void hablar() {
        System.out.println("Animal habla");
    }

    @Override
    public void desplazarse() {
        System.out.println("Animal se desplaza");
    }

    @Override
    public void jugar() {
        System.out.println("Animal juega");
    }

    @Override
    public void alimentarse() {
        System.out.println("Animal se alimenta");
    }

    @Override
    public void dormir() {
        System.out.println("Animal se duerme");
    }
    
}
