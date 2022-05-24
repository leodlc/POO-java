
package herenciahumanoapp;


public class Ciudadano extends Humano {
    private String identificacion;
    public Ciudadano(String nombre, String apellido,String identificacion){
        super(nombre,apellido);
        this.identificacion=identificacion;
    }
    public void GenerarNombreCompleto(){
        System.out.println("Identificacion: "+identificacion);
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        
    }
}
