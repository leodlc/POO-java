
package pruebap2app;


public class InmuebleDepartamento extends Inmueble {
    private String pisoConcreto;

    public InmuebleDepartamento(String pisoConcreto, String direccion, String estado, double precioBase, double metrosCuadrados, int años) {
        super(direccion, estado, precioBase, metrosCuadrados, años);
        this.pisoConcreto = pisoConcreto;
    }

   

   

    public String getPisoConcreto() {
        return pisoConcreto;
    }
    

    @Override
    public double calcularPrecioInmueble() {
        double precioF;
        if(super.getAños()<15){
            precioF= super.getPrecioBase()-super.getPrecioBase()*0.01;
        }else{
            precioF= super.getPrecioBase()-super.getPrecioBase()*0.02;
        }
        return precioF;
    }
    
}
