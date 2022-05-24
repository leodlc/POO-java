/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapractica3parcialapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class Kit extends PiezaAbstracta {
    private List<PiezaAbstracta> listaPieza=new ArrayList<PiezaAbstracta>();
    private int numero;
    public Kit(int numero,String nombre){
        super(nombre,0,0);
    }


    

    

    @Override
    public double getPrecio() {
       double resultado=0;
       double descuento=10/100;
       for(PiezaAbstracta recorre:listaPieza){
           resultado+=recorre.getPrecio();
           resultado-=resultado*descuento;
       }
       return resultado;
    }


    @Override
    public void setPrecio(double precio) {
        //podia modificarse algun precio de un elemento de la coleccion
    }
    @Override
    public double getTiempo() {
        double resultadoTiempo=0;
        
        double descuento=10/100;
        for(PiezaAbstracta recorre:listaPieza){
           resultadoTiempo+=recorre.getTiempo();
           resultadoTiempo+=resultadoTiempo*descuento;
       }
        return resultadoTiempo;
    }

    @Override
    public void setTiempo(double tiempo) {
        
    }
    public void adicionarProducto(PiezaAbstracta pieza){
        listaPieza.add(pieza);
    }
    public boolean eliminarProducto(PiezaAbstracta producto){
        return this.listaPieza.remove(producto);
    }

    
    
}
