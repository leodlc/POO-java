/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcionprueba;

/**
 *
 * @author AsrockLeo
 */
public class GestorCorrecionPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CorreccionPrueba electro = new CorreccionPrueba('A',50,"azul");
        electro.establecerPrecioFinal();
        //objMarcimex.establecerPrecioFinal();
        if(electro.lanzarDados()==12){
            electro.definirDescuento();
        }
        System.out.println(electro.toString());
    }
    
}
