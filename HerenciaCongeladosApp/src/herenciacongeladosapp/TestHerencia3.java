
package herenciacongeladosapp;

import java.time.LocalDate;
import java.time.Month;


public class TestHerencia3 {
    private ProductoFresco productFresh;
    private ProductoRefrigerado productRefri;
    private ProductoCongelado productoCong;

    public TestHerencia3() {
    }

    public void crearProductos(){
        ProductoFresco productfres1 = new ProductoFresco(LocalDate.of(2021, Month.NOVEMBER, 23),LocalDate.of(2021, Month.MARCH, 13),"XM98","Ecuador");
        ProductoFresco productfres2 = new ProductoFresco(LocalDate.of(2021, Month.DECEMBER, 24),LocalDate.of(2021, Month.FEBRUARY, 11),"XM92","Ecuador");
        ProductoRefrigerado productrefri1= new ProductoRefrigerado(LocalDate.of(2021, Month.SEPTEMBER, 18),LocalDate.of(2021, Month.APRIL, 19),"XM010","ECUADOR","GL023583","4°C");
        ProductoRefrigerado productrefri2= new ProductoRefrigerado(LocalDate.of(2021, Month.OCTOBER, 18),LocalDate.of(2021, Month.APRIL, 20),"XM015","ECUADOR","GL054562","6°C");
        ProductoRefrigerado productrefri3= new ProductoRefrigerado(LocalDate.of(2021, Month.SEPTEMBER, 2),LocalDate.of(2021, Month.APRIL, 3),"XM019","ECUADOR","GL0345378","5°C");
        ProductoCongelado productoAgua1= new CongeladoAgua(LocalDate.of(2021, Month.DECEMBER, 30),LocalDate.of(2021, Month.FEBRUARY, 19),"XIP25","Ecuador","-20°C","253ppm");
        ProductoCongelado productoAgua2= new CongeladoAgua(LocalDate.of(2021, Month.DECEMBER, 4),LocalDate.of(2021, Month.FEBRUARY, 10),"XWD21","Ecuador","-20°C","257ppm");
        ProductoCongelado productoAire1= new CongeladoAire(LocalDate.of(2021, Month.NOVEMBER, 17),LocalDate.of(2021, Month.JANUARY, 23),"XPl67","Ecuador","-18°C","27%");
        ProductoCongelado productoAire2= new CongeladoAire(LocalDate.of(2021, Month.AUGUST, 17),LocalDate.of(2021, Month.APRIL,23),"XPl67","Ecuador","-20°C","28%");
        ProductoCongelado productoNitro1= new CongeladoNitrogeno(LocalDate.of(2021, Month.DECEMBER, 31),LocalDate.of(2021, Month.JANUARY, 1),"XNJP1","Ecuador","-23°C","Criogenización","40 minutos");
        System.out.println("----------");
        System.out.println("PRODUCTOS FRESCOS: ");
        productfres1.generarDatosProductoFresco();
        System.out.println("----------");
        productfres2.generarDatosProductoFresco();
        System.out.println("----------");
        System.out.println("PRODUCTOS REFRIGERADOS: ");
        productrefri1.generarDatosProductoRefrigerado();
        System.out.println("----------");
        productrefri2.generarDatosProductoRefrigerado();
        System.out.println("----------");
        productrefri3.generarDatosProductoRefrigerado();
        System.out.println("----------");
        System.out.println("PRODUCTOS CONGELADOS: ");
        productoAgua1.generarDatosProductoCongelado();
        System.out.println("----------");
        productoAgua2.generarDatosProductoCongelado();
        System.out.println("----------");
        productoAire1.generarDatosProductoCongelado();
        System.out.println("----------");
        productoAire2.generarDatosProductoCongelado();
        System.out.println("----------");
        productoNitro1.generarDatosProductoCongelado();
    }
    
    
    
    
}
