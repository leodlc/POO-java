/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaautoaapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class ListaAutos {
    List <Auto>listAuto;

    public ListaAutos() {
        listAuto=new ArrayList <Auto>();
    }
    public void adicionarAuto(Auto auto){
        listAuto.add(auto);
    }
    public int definirTamanoLista(int tamano){
        return listAuto.size();
    }
    public void llenarListaAutos(){
        Auto aux= new Auto();
        Iterator it= listAuto.iterator();
        while(it.hasNext())
        {
            aux=(Auto)it.next();
            System.out.println(aux.toString());
        }
    }
    public void llenarListaAutos2(){
        Auto aux= new Auto();
        for (Object objeto: listAuto){
            aux=(Auto) objeto;
            System.out.println(aux.toString());
        }
    }
    
    
    
    
    public void mostrarAutos(){
        Auto aux= new Auto();
        Iterator it= listAuto.iterator();
        while(it.hasNext())
        {
            aux=(Auto)it.next();
            System.out.println(aux.toString());
        }
    }
    
    public void mostrarMayorKm(){
        Auto mayorkm= new Auto();
        Auto aux= new Auto();
        int i=0;
        Iterator it= listAuto.iterator();
        while(it.hasNext())
        {
            aux=(Auto)it.next();
            if(listAuto.get(i).getKm()>mayorkm.getKm()){
                mayorkm=listAuto.get(i);
            }
            i++;
        }
        
    }
    
    public void mostrarKmpasado(int valor){
        Auto mayorkm= new Auto();
        Auto aux= new Auto();
        int i=0;
        Iterator it= listAuto.iterator();
        while(it.hasNext())
        {
            aux=(Auto)it.next();
            if(listAuto.get(i).getKm()>= valor){
                System.out.println(listAuto.get(i));
                
            }
            i++;
        }
        
    }
    
    public void mostrarPorMarca(String marca){
        Auto mayorkm= new Auto();
        Auto aux= new Auto();
        int i=0;
        Iterator it= listAuto.iterator();
        while(it.hasNext())
        {
            aux=(Auto)it.next();
            if(listAuto.get(i).getMarca().equalsIgnoreCase(marca)){
                System.out.println(listAuto.get(i));
                
            }
            i++;
        }
    }
    public void ordenar(){
        Collections.sort(listAuto);
    }
    public void ordenarKilometraje(){
        Collections.sort(listAuto, new OrdenarAutoKm());
    }
    
}



