
package examencorreccion2app;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Mascota {
    private int codigo;
    private String alias,raza,colorPelo,fechaNacimiento;
    private float pesoMedio18visitas,pesoActual;
    private Cliente dueño;
    private Historial historial;

    public Mascota(int codigo, String alias, String raza, String colorPelo, String fechaNacimiento, float pesoMedio18visitas, float pesoActual, Cliente dueño, Historial historial) {
        this.codigo = codigo;
        this.alias = alias;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoMedio18visitas = pesoMedio18visitas;
        this.pesoActual = pesoActual;
        this.dueño = dueño;
        this.historial = historial;
    }
    
    //Getters and setters

    public int getCodigo() {
        return codigo;
    }

    public String getAlias() {
        return alias;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getPesoMedio18visitas() {
        return pesoMedio18visitas;
    }

    public float getPesoActual() {
        return pesoActual;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPesoMedio18visitas(float pesoMedio18visitas) {
        this.pesoMedio18visitas = pesoMedio18visitas;
    }

    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
    public String mostrarHistorial(){
        return "Mostrando historial de la mascota:"+ this.getAlias()
    }
    public void guardarHistorial(){
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo= new File(pathname "Historial"+ this.getAlias()+".txt");
        try{
            escribir= new FileWriter(archivo, append:true);
            linea= new PrintWriter(escribir);
            linea.println(mostrarHistorial());
            linea.close();
            escribir.close();
        }
    }
}
