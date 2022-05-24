
package pruebap2app;


public class GestorPruebaP2App {

    
    public static void main(String[] args) {
        InmuebleDepartamento depa= new InmuebleDepartamento("Losa","Quito","Nuevo",40000,300,2);
        InmuebleLocal local= new InmuebleLocal(5,"Guayaquil","Segunda Mano",15000,200,7);
        InmuebleDepartamento depa2= new InmuebleDepartamento("Losa","Ambato","SemiNuevo",20000,300,3);
        InmuebleLocal local2= new InmuebleLocal(5,"Manta","Segunda Mano",30000,200,5);
        System.out.println("Informacion de viviendas");
        System.out.println("----------------------------");
        System.out.println("Precio inmueble: "+depa.calcularPrecioInmueble());
        System.out.println("Direccion: "+depa.getDireccion());
        System.out.println("Estado:"+depa.getEstado());
        System.out.println("Piso Concreto"+depa.getPisoConcreto());
        
        
    }
    
}
