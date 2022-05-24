
package herenciacongeladosapp;
import java.time.LocalDate;
import java.time.Month;


public class GestorHerenciaCongeladosApp {

  
    public static void main(String[] args) {
        Producto producto1= new Producto(LocalDate.of(2021, Month.NOVEMBER, 15),LocalDate.now(),"XP027","Ecuador");
        System.out.println(producto1.datosProducto());
        System.out.println("------------------------------");
        System.out.println("PRODUCTO FRESCO");
        ProductoFresco productoF= new ProductoFresco(LocalDate.of(2021, Month.OCTOBER, 14),LocalDate.of(2021, Month.MARCH, 15),"XP030","Peru");
        productoF.generarDatosProductoFresco();
        System.out.println("------------------------------");
        System.out.println("PRODUCTO REFRIGERADO");
        ProductoRefrigerado productoRef= new ProductoRefrigerado(LocalDate.of(2021, Month.SEPTEMBER, 16),LocalDate.of(2021, Month.APRIL, 12),"XM050","Colombia","GH023486","5°C");
        productoRef.generarDatosProductoRefrigerado();
        System.out.println("------------------------------");
        System.out.println("PRODUCTO CONGELADO");
        ProductoCongelado productocong= new ProductoCongelado(LocalDate.of(2021, Month.AUGUST, 1),LocalDate.of(2021, Month.MARCH, 25),"XlL55","Chile","-18°C");
        productocong.generarDatosProductoCongelado();
        System.out.println("------------------------------");
        System.out.println("PRODUCTO CONGELADO POR AIRE");
        CongeladoAire productcongAir= new CongeladoAire(LocalDate.of(2021, Month.NOVEMBER, 19),LocalDate.of(2021, Month.JANUARY, 5),"XOP65","Argentina","-19°C","26%");
        productcongAir.generarDatosProductoCongeladoaAire();
        System.out.println("------------------------------");
        System.out.println("PRODUCTO CONGELADO POR AGUA");
        CongeladoAgua congAgua= new CongeladoAgua(LocalDate.of(2021, Month.DECEMBER, 20),LocalDate.of(2021, Month.FEBRUARY, 24),"XYP15","Venezuela","-21°C","250ppm");
        congAgua.generarDatosProductoCongeladoaAgua();
        System.out.println("------------------------------");
        System.out.println("PRODUCTO CONGELADO POR NITROGENO");
        CongeladoNitrogeno congNitro = new CongeladoNitrogeno(LocalDate.of(2021, Month.DECEMBER, 9),LocalDate.of(2021, Month.JULY, 8),"XYP15","Venezuela","-21°C","Fluidos criogénicos por medio de Dioxido de Carbono y Freón","20 minutos");
        congNitro.generarDatosProductoCongeladoaNitrogeno();
        System.out.println("----------------------------------------------------------------");
        System.out.println("---------------------TEST DE HERENCIA---------------------------");
        TestHerencia3 test= new TestHerencia3();
        test.crearProductos();
        System.out.println(productoF.datosProducto());
    }
    
}

