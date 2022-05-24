
package polimorfismodeberapp;


public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double salarioPorHoras;

    public EmpleadoPorHoras(double horasTrabajadas, double salarioPorHoras, String nombre, int numeroSeguroSocial) {
        super(nombre, numeroSeguroSocial);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHoras = salarioPorHoras;
    }

    

    @Override
    public double calcularSalario() {
        return salarioPorHoras*horasTrabajadas;
    }
    
    
}
