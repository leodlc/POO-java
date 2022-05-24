/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacongeladosv2app;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author AsrockLeo
 */
public class GestorHerenciaCongeladosv2App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fecha fecha = new Fecha();
        Producto producto1 = new Producto(LocalDate.now(),LocalDate.of(2021, Month.NOVEMBER, 15),"XP028","Ecuador");
        System.out.println(producto1.datosProducto());
    }
    
}
