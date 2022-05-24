/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivobinarioapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorArchivoBinarioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoBinario arch=new ArchivoBinario();
        arch.escribir();
        arch.leer();
    }
    
}
