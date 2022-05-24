
package polimorfismodeberapp;


public abstract class Empleado {
    private String nombre;
    private int numeroSeguroSocial;

    public Empleado(String nombre, int numeroSeguroSocial) {
        this.nombre = nombre;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    
    public abstract double calcularSalario();
    
}
