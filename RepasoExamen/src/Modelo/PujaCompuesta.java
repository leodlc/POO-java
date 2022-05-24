/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author AsrockLeo
 */
public class PujaCompuesta extends PujaAbstracta {
    //private List<PujaAbstracta> listaPujas= new ArrayList<PujaAbstracta>();
    private List<PujaAbstracta> listaProductos=new ArrayList<PujaAbstracta>();

    public PujaCompuesta(double pujaRealizada, String nombrePujador) {
        super(3000, nombrePujador);
    }

    public PujaCompuesta() {
    }
    
    
    @Override
    public double getPujaRealizada() {
       double resultado=3000;
       for(PujaAbstracta recorre:listaProductos){
           resultado+=recorre.getPujaRealizada();
       }
       return resultado;
    }

    @Override
    public void setPujaRealizada(double pujaRealizada) {
        //
    }
    public void adicionarPuja(PujaAbstracta puja){
        listaProductos.add(puja);
    }
    public boolean eliminarPuja(PujaAbstracta puja){
        return this.listaProductos.remove(puja);
    }
    
}
