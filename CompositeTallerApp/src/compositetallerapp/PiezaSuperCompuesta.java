/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetallerapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class PiezaSuperCompuesta extends PiezaAbstracta {
    private List<PiezaAbstracta> listaPiezaMayor=new ArrayList<PiezaAbstracta>();
    
    public PiezaSuperCompuesta(String nombre){
        super(nombre,0);
    }
    @Override
    public double getPrecio() {
       double resultado=0;
       for(PiezaAbstracta recorre:listaPiezaMayor){
           resultado+=recorre.getPrecio();
       }
       return resultado;
    }

    @Override
    public void setPrecio(double precio) {
        //podia modificarse algun precio de un elemento de la coleccion
    }
    public void adicionarPieza(PiezaAbstracta pieza){
        listaPiezaMayor.add(pieza);
    }
    public boolean eliminarPieza(PiezaAbstracta pieza){
        return this.listaPiezaMayor.remove(pieza);
    }
}
