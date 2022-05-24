/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaalummnoapp;

import java.util.Comparator;

/**
 *
 * @author AsrockLeo
 */
public class OrdenarAlumnoEdad implements Comparator <Alumno> {
    @Override
    public int compare(Alumno o1,Alumno o2){
        return o1.getEdad()-o2.getEdad();
    }
}
