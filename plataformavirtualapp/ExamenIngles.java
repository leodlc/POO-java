/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataformavirtualapp;

/**
 *
 * @author espe
 */
public class ExamenIngles implements Examen {

    @Override
    public int limitarTiempo() {
        int minutos=7;
        return minutos;
    }
    
}
