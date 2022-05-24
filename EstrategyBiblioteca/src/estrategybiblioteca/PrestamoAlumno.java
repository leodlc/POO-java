/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategybiblioteca;

/**
 *
 * @author AsrockLeo
 */
public class PrestamoAlumno implements Prestamo {
    @Override
    public void estadoDelLibro() {
        Libro libro= new Libro();
        System.out.println("Primer prestamo:");
        libro.prestarLibroRegular();
        System.out.println("Segundo prestamo:");
        libro.prestarLibroBueno();
        System.out.println("Tercer prestamo:");
        libro.prestarLibroNuevo();
    }
    
    @Override
    public void prestarLibro() {
        Alumno alumno= new Alumno("3 meses");
        System.out.println("Mensualidad de: "+ alumno.getMensualidad());
    }


    
}
