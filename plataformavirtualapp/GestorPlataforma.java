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
public class GestorPlataforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaAbstracta eval=new FabricaProgramacion();
        
        Prueba objPrueba= eval.generaPrueba();
        Examen  objExamen= eval.generaExamen();
        System.out.println("Preguntas:  " + objPrueba.limitarPreguntas());
        System.out.println("Tiempo:  " +  objExamen.limitarTiempo());
        
        
        
    }
    
}
