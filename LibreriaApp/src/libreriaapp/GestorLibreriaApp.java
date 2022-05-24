
package libreriaapp;


public class GestorLibreriaApp {

   
    public static void main(String[] args) {
        Autor autor1=new Autor("Lovecraft","EEUU");
        Libro libro1=new Libro("C1","El ser en el umbral",Tematica.FICCION,autor1,100,200d);
        libro1.controlarRangoPrecio();
        
    }
    
}
