package coreccion2examenapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mascota {
    private int codigo;
    private String alias, raza, colorPelo, fechaNacimiento;
    private float pesoMedio10Visitas, pesoActual;
    private Cliente dueño;
    private Historial historial;

    public Mascota(int codigo, String alias, String raza, String colorPelo, String fechaNacimiento, float pesoActual) {
        try {
            if (codigo <= 100 && codigo > 0) {
                this.codigo = codigo;
            } else {
                throw new ExcepcionCodigo("El codigo tiene que estar entre 0 y 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.codigo = codigo;
        this.alias = alias;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoMedio10Visitas = pesoMedio10Visitas;
        this.pesoActual = pesoActual;
        this.dueño = dueño;
        this.historial = historial;
    }

    //Getters And Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getPesoMedio10Visitas() {
        return pesoMedio10Visitas;
    }

    public void setPesoMedio10Visitas(float pesoMedio10Visitas) {
        this.pesoMedio10Visitas = pesoMedio10Visitas;
    }

    public float getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public String mostrarHistorial() {
        return "Mostrando historial de la mascota: " + this.getAlias() + "\n" + this.historial.mostrarHistorial();
    }

    public void agregarHistorial(Historial historial) {
        this.historial = historial;
    }



    public void guardarHistorial() {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("Historial" + this.getAlias() + ".txt");
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(mostrarHistorial());
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
}
