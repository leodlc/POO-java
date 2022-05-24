/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revistaobservadorapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class Empresa implements Sujeto {
    private List listaObs= new ArrayList<Observador>();
    
    public void suscribirse(Observador o){
        listaObs.add(o);
       
    }
    public void desafiliarse(Observador o){
        listaObs.remove(o);
    }
    public void enviarRevista(Revista r){
        for(int i=0;i<listaObs.size();i++){    
            listaObs.get(i).
        }    
    }
}
