/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionn2app;

import java.util.ArrayList;

/**
 *
 * @author AsrockLeo
 */
public class Persona {
    private ArrayList<Proyecto> proyectos = new ArrayList();
    private String nombre;

    public Persona() {
    }
    

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getProyectos() {
        return proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProyectos(ArrayList proyectos) {
        this.proyectos = proyectos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void asignarProyecto(Proyecto proyecto){
        proyectos.add(proyecto);
        
    }
    
    public void desasignarProyecto(Proyecto proyecto){
        proyectos.remove(proyecto);
    }
    public Proyecto GetProyecto(int index){
        return (Proyecto) proyectos.get(index);
    }
    public int getCuentaProyecto(){
        return proyectos.size();
    }
    

    @Override
    public String toString() {
        return "Persona{" + "proyectos=" + proyectos + ", nombre=" + nombre + '}';
    }
    
    
    
}
