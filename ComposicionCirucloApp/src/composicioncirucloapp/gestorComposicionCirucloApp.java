/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncirucloapp;

/**
 *
 * @author AsrockLeo
 */
public class gestorComposicionCirucloApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto objPunto= new Punto(2,5);
        Circulo objCirculo= new Circulo(objPunto,16);
        System.out.println("El area es:"+objCirculo.CalcularArea());
        System.out.println("El primetro es: "+objCirculo.calcularPerimetro());
        objCirculo.DesplazarCentro(6, 2);
        System.out.println(objCirculo.toString());
    }
    
}
