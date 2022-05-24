/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacongeladosv2app;
import java.time.LocalDate;
/**
 *
 * @author AsrockLeo
 */
public class Producto {
    protected LocalDate fechaCaducidad,fechaEnvasado;
    protected String numeroLote,paisOrigen;

    public Producto(LocalDate fechaCaducidad, LocalDate fechaEnvasado, String numeroLote, String paisOrigen) {
        this.fechaCaducidad = fechaCaducidad;
        this.fechaEnvasado = fechaEnvasado;
        this.numeroLote = numeroLote;
        this.paisOrigen = paisOrigen;
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
    public String datosProducto(){
        return fechaCaducidad+" "+fechaEnvasado+" "+numeroLote+" "+paisOrigen;
    }
    
    
}
