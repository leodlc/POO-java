/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionn3app;

/**
 *
 * @author Jimena
 */
public class GestorProyectoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Proyecto p1=new Proyecto("Analisis");
        Proyecto p2=new Proyecto("Marketing");
        Persona m1=new Persona("Maria");
        Persona m2=new Persona("Lucia");
        Persona m3=new Persona("Lu");
        p1.AgregarPersona(m1);
        p2.AgregarPersona(m2);
        p2.AgregarPersona(m3);
        m1.AsignarProyecto(p1);
        m2.AsignarProyecto(p2);
        m3.AsignarProyecto(p2);
        
        
       
        p1.mostrarPersona();
        System.out.println("Otro proyecto");
        p2.mostrarPersona();
        
        m1.mostrarProyectos();
        
        //p1.removerPersona(m2);
        
    }
    
}
