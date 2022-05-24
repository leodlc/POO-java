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
public class FabricaIngles implements FabricaAbstracta{
    
    public Prueba generaPrueba()
    {
        Prueba p= new PruebaIngles();
        return p;
    }
    
    public Examen generaExamen()
    {
        Examen e= new ExamenIngles();
        return e;
    }
    
}
