
package herenciacongeladosapp;
import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoCongelado {
    private String infometodoCongelacion,tiempoExpoNitrogeno;

    public CongeladoNitrogeno(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen, String temperaturaMantenimientoCong,String infometodoCongelacion, String tiempoExpoNitrogeno) {
        super(fechaCaducidad, fechaEnvasado, numeroLote, paisOrigen, temperaturaMantenimientoCong);
        this.infometodoCongelacion = infometodoCongelacion;
        this.tiempoExpoNitrogeno = tiempoExpoNitrogeno;
    }
    //GETERS AND SETTERS

    public String getInfometodoCongelacion() {
        return infometodoCongelacion;
    }

    public String getTiempoExpoNitrogeno() {
        return tiempoExpoNitrogeno;
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

    public void setInfometodoCongelacion(String infometodoCongelacion) {
        this.infometodoCongelacion = infometodoCongelacion;
    }

    public void setTiempoExpoNitrogeno(String tiempoExpoNitrogeno) {
        this.tiempoExpoNitrogeno = tiempoExpoNitrogeno;
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
    public void generarDatosProductoCongeladoaNitrogeno(){
        System.out.println("Información del metodo de congelación: "+infometodoCongelacion);
        System.out.println("Tiempo de exposición al nitrógeno: "+tiempoExpoNitrogeno);
        System.out.println("Temperatura de mantenimiento del producto congelado: "+temperaturaMantenimientoCong);
        System.out.println("Fecha de Caducidad: "+fechaCaducidad);
        System.out.println("Fecha de Envasado: "+fechaEnvasado);
        System.out.println("Numero de Lote: "+numeroLote);
        System.out.println("Pais de Origen: "+paisOrigen);
    }

    
    
}
