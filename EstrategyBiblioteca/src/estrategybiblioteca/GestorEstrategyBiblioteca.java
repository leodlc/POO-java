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
public class GestorEstrategyBiblioteca {

    public static void main(String[] args) {
        Alumno alumno= new Alumno();
        Profesor profesor= new Profesor();
        Socio socio= new Socio();
        System.out.println("--------------------------------------");
        System.out.println("        Prestamo del alumno");
        alumno.setTipoPrestamo(new PrestamoAlumno());
        alumno.prestarLibro();
        System.out.println("--------------------------------------");
        System.out.println("        Prestamo del profesor");
        profesor.setTipoPrestamo(new PrestamoProfesor());
        profesor.prestarLibro();
        System.out.println("--------------------------------------");
        System.out.println("        Prestamo del socio");
        socio.setTipoPrestamo(new PrestamoSocio());
        socio.prestarLibro();
        
        
        
    }
    
}
