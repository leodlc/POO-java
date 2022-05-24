
package pruebap2app;


public abstract class Inmueble implements Inmobiliaria {
    private String direccion,estado;
    private double precioBase,metrosCuadrados;
    private int años;

    public Inmueble(String direccion, String estado, double precioBase, double metrosCuadrados, int años) {
        this.direccion = direccion;
        this.estado = estado;
        this.precioBase = precioBase;
        this.metrosCuadrados = metrosCuadrados;
        this.años = años;
    }

    public double getPrecioBase() {
        return precioBase;
    }

   

    public int getAños() {
        return años;
    }
    
    
    

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    
    

    @Override
    public abstract double calcularPrecioInmueble(); 
        
    

    
    
        
}
