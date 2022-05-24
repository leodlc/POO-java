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
public class PrestamoSocio implements Prestamo {

    @Override
    public void estadoDelLibro() {
        Libro libro= new Libro();
        System.out.println("Primer prestamo:");
        libro.prestarLibroNuevo();
        System.out.println("Segundo prestamo:");
        libro.prestarLibroBueno();
        System.out.println("Tercer prestamo:");
        libro.prestarLibroRegular();
    }

    @Override
    public void prestarLibro() {
       Socio socio= new Socio(4.21);
        System.out.println("Cuota a pagar: "+socio.getCuota());
    }
    
}
