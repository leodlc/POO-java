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
public class PrestamoProfesor implements Prestamo {

    @Override
    public void estadoDelLibro() {
        Libro libro= new Libro();
        System.out.println("Primer prestamo:");
        libro.prestarLibroBueno();
        System.out.println("Segundo prestamo:");
        libro.prestarLibroNuevo();
        System.out.println("Tercer prestamo:");
        libro.prestarLibroRegular();
    }

    @Override
    public void prestarLibro() {
        Profesor profe= new Profesor("Matematicas");
        System.out.println("Catedra del profesor: "+ profe.getCatedra());
    }
    
}
