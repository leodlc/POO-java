
package herenciacongeladosapp;
import java.time.LocalDate;

public class CongeladoAire extends ProductoCongelado {
    private String composicionAire;

    public CongeladoAire(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen, String temperaturaMantenimientoCong,String composicionAire ) {
        super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimientoCong);
        this.composicionAire = composicionAire;
    }
   //GETERS AND SETTERS

    public String getComposicionAire() {
        return composicionAire;
    }

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

    public void setComposicionAire(String composicionAire) {
        this.composicionAire = composicionAire;
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
    //METODOS
    public void generarDatosProductoCongeladoaAire(){
        System.out.println("Composicion del Aire: "+composicionAire);
        System.out.println("Temperatura de mantenimiento del producto congelado: "+temperaturaMantenimientoCong);
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
        System.out.println("Fecha de Envasado: "+fechaEnvasado);
        System.out.println("Numero de Lote: "+numeroLote);
        System.out.println("Pais de Origen: "+paisOrigen);
    }
    
}
