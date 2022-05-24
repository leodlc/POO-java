/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revistaobservadorapp;

/**
 *
 * @author AsrockLeo
 */
public class Suscriptor implements Observador {

    @Override
    public void update(Revista r) {
        System.out.println("La revista se ha enviado");
    }
    
}
