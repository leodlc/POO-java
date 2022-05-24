/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaalummnoapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class ListaAlumno {
    //List listA; //creando un objeto listA de la clase list
    List <Alumno>listA; //indicar que solo va a recibir objetipos tipo alumno
    //crear una referencia
    public ListaAlumno(){
        //instanciamos el objeto
        listA= new ArrayList <Alumno>(); // he creado una lista que solo va a recibir alumnos
        
    }
    public void adicionarAlummno(Alumno alumno1){
        listA.add(alumno1);
    }
    public int definirTamanoLista(){
        return listA.size();
    }
    public void mostrarAlumnos(){
        Alumno aux= new Alumno();
        Iterator it= listA.iterator();
        while(it.hasNext())
        {
            aux=(Alumno)it.next();
            System.out.println(aux.toString());
        }
    }
    public void mostrarAlumnos2(){
        Alumno aux= new Alumno();
        for (Object objeto: listA){
            aux=(Alumno) objeto;
            System.out.println(aux.toString());
        }
    }
    public void ordenar(){
        Collections.sort(listA);
    }
    public void ordenarEdad(){
        Collections.sort(listA, new OrdenarAlumnoEdad());
    }
    
}
