
package polimorfismodeberapp;


public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String nombre, int numeroSeguroSocial) {
        super(nombre, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    
    

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }
    
}
