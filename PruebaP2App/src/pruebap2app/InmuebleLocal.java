
package pruebap2app;


public class InmuebleLocal extends Inmueble implements Vivienda {
    private int numeroVentanas;

    public InmuebleLocal(int numeroVentanas, String direccion, String estado, double precioBase, double metrosCuadrados, int años) {
        super(direccion, estado, precioBase, metrosCuadrados, años);
        this.numeroVentanas = numeroVentanas;
    }

    

    

   
    

    public int getNumeroVentanas() {
        return numeroVentanas;
    }
    
    @Override
    public double calcularPrecioInmueble() {
        double precioF;
        if(super.getAños()<15){
            precioF= super.getPrecioBase()-super.getPrecioBase()*0.01;
        }else{
            precioF= super.getPrecioBase()-super.getPrecioBase()*0.02;
        }
        if(super.getMetrosCuadrados()>=50){
            precioF= super.getPrecioBase()*0.01;
            
        }
        if(numeroVentanas<=1){
            precioF-=super.getPrecioBase()*0.02;
        }else if(numeroVentanas>4){
            precioF+=super.getPrecioBase()*0.02;
        }
        return precioF+impuestoCatrastal;
    }
    
}
