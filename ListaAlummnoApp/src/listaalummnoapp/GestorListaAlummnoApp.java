/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaalummnoapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorListaAlummnoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(12,"Ana",22);
        Alumno alumno2 = new Alumno(13,"Pablo",33);
        Alumno alumno3 = new Alumno(14,"Juan",19);
        Alumno alumno4 = new Alumno(21,"Pedro",19);
        ListaAlumno lista = new ListaAlumno();
        lista.adicionarAlummno(alumno1);
        lista.adicionarAlummno(alumno2);
        lista.adicionarAlummno(alumno3);
        lista.adicionarAlummno(alumno4);
        lista.mostrarAlumnos();
        System.out.println("Cantidad elementos: "+ lista.definirTamanoLista());
        lista.ordenarEdad();
        lista.mostrarAlumnos();
    }
    
}
