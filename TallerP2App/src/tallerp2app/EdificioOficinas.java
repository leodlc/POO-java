
package tallerp2app;

/**
 *
 * @author AsrockLeo
 */
public class EdificioOficinas implements Edificio {
    private int numeroOficinas;
    private double largo,ancho,numeroPisos;

    public EdificioOficinas(int numeroOficinas, double largo, double ancho, double numeroPisos) {
        this.numeroOficinas = numeroOficinas;
        this.largo = largo;
        this.ancho = ancho;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    
    

    @Override
    public double getSuperficieEdificio() {
        return largo*numeroPisos*ancho;
    }

    @Override
    public String mostrarInfo() {
        return  " El edificio tiene  una superficie de: " + getSuperficieEdificio()+" Y su numero de oficinas es: "+getNumeroOficinas();
    }
    
}
