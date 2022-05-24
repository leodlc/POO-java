
package ec.edu.espe.veterinaria;

import java.time.LocalDate;

public class Mascota {
    private int codigo;
    private String alias;
    private String raza;
    private String colorPelo;
    private LocalDate fechaNacimiento;
    private double pesoMedio;
    private double pesoActual;

    public Mascota(int codigo, String alias, String raza, String colorPelo, LocalDate fechaNacimiento, double pesoMedio, double pesoActual) throws Exception {
        this.codigo = codigo;
        this.alias = alias;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
        
        if (codigo < 1 || codigo > 100) {
            throw new Exception("El codigo de una mascota debe estar entre 1 y 100");
        }
    }

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", alias=" + alias + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" + fechaNacimiento + ", pesoMedio=" + pesoMedio + ", pesoActual=" + pesoActual + '}';
    }
}
