package coreccion2examenapp;

import java.util.ArrayList;

public class Historial {
    private ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
    private ArrayList<Vacuna> vacunas = new ArrayList<Vacuna>();


    public Historial() {
    }
    public String mostrarHistorial() {
        String mensaje = "Vacunas: \n";
        for (Vacuna vacuna : vacunas) {
            mensaje += vacuna.toString() + "\n";
        }
        mensaje+= "Enfermedades : \n";
        for (Enfermedad enfermedad : enfermedades) {
            mensaje += enfermedad.toString() + "\n";
        }
        return mensaje;
    }

    public void agregarEnfermedad(Enfermedad enfermedad){
        enfermedades.add(enfermedad);
    }
    public void agregarVacuna(Vacuna vacuna){
        vacunas.add(vacuna);
    }
    public Historial(ArrayList<Enfermedad> enfermedades, ArrayList<Vacuna> vacunas) {
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
    }
}
