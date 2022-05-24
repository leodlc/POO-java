
package herenciacongeladosapp;

import java.time.LocalDate;
public class ProductoCongelado extends Producto {
    protected String temperaturaMantenimientoCong;

    public ProductoCongelado(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen,String temperaturaMantenimientoCong) {
        super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen);
        this.temperaturaMantenimientoCong = temperaturaMantenimientoCong;
    }
    //GETERS AND SETTERS

    public String getTemperaturaMantenimientoCong() {
        return temperaturaMantenimientoCong;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setTemperaturaMantenimientoCong(String temperaturaMantenimientoCong) {
        this.temperaturaMantenimientoCong = temperaturaMantenimientoCong;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    //metodos
    public void generarDatosProductoCongelado(){
        System.out.println("Temperatura de mantenimiento del producto congelado: "+temperaturaMantenimientoCong);
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
        System.out.println("Fecha de Envasado: "+fechaEnvasado);
        System.out.println("Numero de Lote: "+numeroLote);
        System.out.println("Pais de Origen: "+paisOrigen);
    }
    
}
