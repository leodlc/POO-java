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
public class FabricaMatematicas implements FabricaAbstracta{
    
    public Prueba generaPrueba()
    {
        Prueba p= new PruebaMatematicas();
        return p;
    }
    
    public Examen generaExamen()
    {
        Examen e= new ExamenMatematicas();
        return e;
    }
    
}
