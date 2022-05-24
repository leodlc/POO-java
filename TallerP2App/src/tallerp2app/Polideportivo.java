
package tallerp2app;

/**
 *
 * @author AsrockLeo
 */
public class Polideportivo implements InstalacionDeportiva,Edificio {
    private String nombre;
    private int TipoDeInstalacion;
    private double largo,ancho;

    public Polideportivo(String nombre, int TipoDeInstalacion, double largo, double ancho) {
        this.nombre = nombre;
        this.TipoDeInstalacion = TipoDeInstalacion;
        this.largo = largo;
        this.ancho = ancho;
    }
    

    

    public String getNombre() {
        return nombre;
    }
    
    

    @Override
    public int getTipoDeInstalacion() {
        return TipoDeInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return ancho*largo;
    }

    @Override
    public String mostrarInfo() {
        return "El polideportivo es de tipo: " + getTipoDeInstalacion() + " con una superficie de: " + getSuperficieEdificio()+" Y su nombre es: "+getNombre();
    }
    

   
    
}
