
package claseabstractaapp;


public class Empleado extends Persona implements Enfermo{
    private float sueldo;
    private String Direccion;

    public Empleado(float sueldo, String Direccion, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.Direccion = Direccion;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    @Override
    public void tomarTemperatura() {
        System.out.println("Tomar temperatura");
    }

    @Override
    public void tomarMedicamentos() {
        System.out.println("Tomar medicamnetos");
    }
    
    public void mostrarInfformacion(){
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Direccion: " + Direccion);
    }
    
}
