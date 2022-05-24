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
public class Proyecto {
    private String nombreProyecto;
    private ArrayList<Persona> team = new ArrayList<Persona>();

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    
    
    public void AgregarPersona(Persona miembro){
        team.add(miembro);
    }
    
    public void removerPersona(Persona miembro){
        team.remove(miembro);
    }
    
    public Persona GetPersona(int index){
        return (Persona) team.get(index);
    }
    
    public void mostrarPersona()
   {
       Persona aux;
       Iterator it=team.iterator();
       while(it.hasNext())
       {
           aux=(Persona)it.next();
           System.out.println(aux.toString());
       }
   }

    @Override
    public String toString() {
        return "Proyecto{" + "nombreProyecto=" + nombreProyecto + '}';
    }
    
}
