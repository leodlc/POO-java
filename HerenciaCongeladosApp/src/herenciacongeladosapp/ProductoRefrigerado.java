
package herenciacongeladosapp;
import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    private String codigoSupervision,temperaturaMantenimientoRefri;

    public ProductoRefrigerado(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen,String codigoSupervision, String temperaturaMantenimientoRefri) {
        super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen);
        this.codigoSupervision = codigoSupervision;
        this.temperaturaMantenimientoRefri = temperaturaMantenimientoRefri;
    }
    //GETERS AND SETTERS

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public String getTemperaturaMantenimientoRefri() {
        return temperaturaMantenimientoRefri;
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

    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public void setTemperaturaMantenimientoRefri(String temperaturaMantenimientoRefri) {
        this.temperaturaMantenimientoRefri = temperaturaMantenimientoRefri;
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
    //MEOTODOS
    public void generarDatosProductoRefrigerado(){
        System.out.println("Código del organismo de supervisión alimentaria: "+codigoSupervision);
        System.out.println("Temperatura de mantenimiento del producto refigerado: "+temperaturaMantenimientoRefri);
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
        System.out.println("Fecha de Envasado: "+fechaEnvasado);
        System.out.println("Numero de Lote: "+numeroLote);
        System.out.println("Pais de Origen: "+paisOrigen);
    }
    

   
    
}
