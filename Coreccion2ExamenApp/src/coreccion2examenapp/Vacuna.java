package coreccion2examenapp;

public class Vacuna {
    private String tipoDeVacuna, fechaDeVacuna;

    public Vacuna(String tipoDeVacuna, String fechaDeVacuna) {
        this.tipoDeVacuna = tipoDeVacuna;
        this.fechaDeVacuna = fechaDeVacuna;
    }

    @Override
    public String toString() {
        return "Vacuna{" +
                "tipoDeVacuna='" + tipoDeVacuna + '\'' +
                ", fechaDeVacuna='" + fechaDeVacuna + '\'' +
                '}';
    }
}
