/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategybiblioteca;

/**
 *
 * @author AsrockLeo
 */
public class Libro {
    private String estadoLibro;

    public Libro() {
    }
    public void prestarLibroRegular(){
        System.out.println("Prestar libro regular");
    }
    public void prestarLibroBueno(){
        System.out.println("Prestar libro en buen estado");
    }
    public void prestarLibroNuevo(){
        System.out.println("Prestar libro nuevo");
    }
    
    

    
    
}
