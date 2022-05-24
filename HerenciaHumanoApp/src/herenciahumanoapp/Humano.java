
package herenciahumanoapp;


public class Humano {
    protected String nombre, apellido;

    public Humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /*
    public void nombreCompleto(){
        String nombrecompleto;
        nombrecompleto=this.nombre+" "+ this.apellido;
        System.out.println(nombrecompleto);
    }
    */
    public String nombreCompleto(){
        return nombre+" "+apellido;
    }
}
