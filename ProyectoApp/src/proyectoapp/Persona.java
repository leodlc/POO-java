/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoapp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jimena
 */
public class Persona {
    
    private String nombre;
    private ArrayList <Proyecto> proyectos =new ArrayList<Proyecto>();

    
    public Persona() {
    }

    public Persona(String nombre) {
        
        this.nombre = nombre;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    public void AsignarProyecto(Proyecto proyecto){
        proyectos.add(proyecto);
        
    }
    
     public void DesasiganarProyecto(Proyecto proyecto){
        proyectos.remove(proyecto);
        
    }
     
     public Proyecto GetProyecto(int index){
        return (Proyecto) proyectos.get(index);
    }
     
     public int GetProyectoCantidad(){
        return proyectos.size();
    }

   
    
    public void mostrarProyectos()
   {
       Proyecto aux;
       Iterator it=proyectos.iterator();
       while(it.hasNext())
       {
           aux=(Proyecto)it.next();
           System.out.println(aux.toString());
       }
   }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

   

    
    
    
}
