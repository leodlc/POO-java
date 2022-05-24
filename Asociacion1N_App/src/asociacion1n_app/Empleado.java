

package asociacion1n_app;


public class Empleado {
    
    private String nombreEmpleado;
    private Departamento dpto;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.dpto=new Departamento();
    }
    
    
    
    public Empleado(String nombreEmpleado, Departamento dpto) {
        this.nombreEmpleado = nombreEmpleado;
        this.dpto = dpto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", dpto=" + dpto + '}';
    }
    
    
}
