package ec.edu.espe.veterinaria;

import java.time.LocalDate;

public class RegistroCalendario {
    private Mascota mascota;
    private String enfermedad;
    private LocalDate fecha;

    public RegistroCalendario(Mascota mascota, String enfermedad, LocalDate fecha) {
        this.mascota = mascota;
        this.enfermedad = enfermedad;
        this.fecha = fecha;
    }
    
    public Mascota getMascota() {
        return mascota;
    }
    
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
