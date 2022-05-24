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
public class Proyecto {
    private ArrayList<Persona> equipo= new ArrayList();

   public Proyecto(){
   }

    
   
    
    
    public void añadirMiembro(Persona miembro) {
        equipo.add(miembro);
    }
    public void removerMiembro(Persona miembro){
        equipo.remove(miembro);
    }
    public Persona GetMiembro(int index){
        return (Persona) equipo.get(index);
    }
}
