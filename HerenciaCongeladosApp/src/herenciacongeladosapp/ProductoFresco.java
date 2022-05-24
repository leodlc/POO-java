
package herenciacongeladosapp;
import java.time.LocalDate;
public class ProductoFresco extends Producto {

    public ProductoFresco(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen) {
        super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen);
    }
    //GETERS AND SETTERS

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
    public void generarDatosProductoFresco(){
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
        System.out.println("Fecha de Envasado: "+fechaEnvasado);
        System.out.println("Numero de Lote: "+numeroLote);
        System.out.println("Pais de Origen: "+paisOrigen);
    }
}
