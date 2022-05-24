
package herenciacongeladosapp;
import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado {
    private String salinidadAgua;

    public CongeladoAgua(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen, String temperaturaMantenimientoCong,String salinidadAgua) {
        super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimientoCong);
        this.salinidadAgua = salinidadAgua;
    }
    //GETERS AND SETTERS

    public String getSalinidadAgua() {
        return salinidadAgua;
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

    public void setSalinidadAgua(String salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
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
    public void generarDatosProductoCongeladoaAgua(){
        System.out.println("Salinidad del Agua: "+salinidadAgua);
        System.out.println("Temperatura de mantenimiento del producto congelado: "+temperaturaMantenimientoCong);
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
        System.out.println("Fecha de Envasado: "+fechaEnvasado);
        System.out.println("Numero de Lote: "+numeroLote);
        System.out.println("Pais de Origen: "+paisOrigen);
    }
    
}
