/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escepcionapp;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 *
 * @author AsrockLeo
 */
public class LecturaExcepcion {
    public static void  main(String args[]) 
    {
        int a, b=0;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader (isr);
        
        try 
        {
           System.out.println("Ingrese un numero 1:");
           a=Integer.parseInt(br.readLine()); 
           System.out.println("Ingrese un numero 2:");
           b=Integer.parseInt(br.readLine());
           System.out.println("resultado"+ a/b);
        }
        
        
        catch (InputMismatchException objIme)
        {
            objIme.getMessage();
        }
        catch (ArithmeticException objAe)
        {
            objAe.getMessage();
        }
        catch(IOException objIo)
        {
            objIo.getMessage();
        }
//        catch (Exception objIe)
//        {
//            objIe.getMessage();
//        }
//        
    }
    
}
