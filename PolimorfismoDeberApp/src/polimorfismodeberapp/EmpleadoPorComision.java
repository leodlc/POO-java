
package polimorfismodeberapp;


public  class EmpleadoPorComision extends Empleado  {
    protected double ventasBrutas;
    protected double tarifaporComision;

    public EmpleadoPorComision(double ventasBrutas, double tarifaporComision, String nombre, int numeroSeguroSocial) {
        super(nombre, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaporComision = tarifaporComision;
    }

    
    

    @Override
    public double calcularSalario() {
        return ventasBrutas*tarifaporComision;
    }

    

   
    
}
