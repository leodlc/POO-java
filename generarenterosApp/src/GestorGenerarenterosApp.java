/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
/**
 *
 * @author AsrockLeo
 */
import java.util.Scanner;
import java.util.Random;
public class GestorGenerarenterosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("Número aleatorio real entre [0,100[ : "+rnd.nextDouble()*100);
    }
    
}
