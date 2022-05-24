
package herenciahumanoapp;


public class GestorHerenciaHumanoApp {

   
    public static void main(String[] args) {
       //Humano humano1= new Humano("Pedro","Garcia");
       Ciudadano ciudadano1= new Ciudadano("Leonardo","De La Cadena","1878465415");
       ciudadano1.GenerarNombreCompleto();
       
        System.out.println(ciudadano1.nombreCompleto());
       
    }
    
}
