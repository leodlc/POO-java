package coreccion2examenapp;

public class Enfermedad {
    private String tipoDeEnfermedad, fechaDeEnfermedad;

    public Enfermedad(String tipoDeEnfermedad, String fechaDeEnfermedad) {
        this.tipoDeEnfermedad = tipoDeEnfermedad;
        this.fechaDeEnfermedad = fechaDeEnfermedad;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "tipoDeEnfermedad='" + tipoDeEnfermedad + '\'' +
                ", fechaDeEnfermedad='" + fechaDeEnfermedad + '\'' +
                '}';
    }
}
