/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepasoapp;

import java.util.Scanner;


public class GestorEjercicioRepasoApp {
//    static int[][] matriz1=null;
//    static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
        /*
        matriz1=definirTamano(matriz1);
        
        System.out.println("FILAS:" + matriz1.length);
        System.out.println("COLUMNAS:" + matriz1[0].length);
        
        System.out.println();
        ingresarValores(matriz1);
        System.out.println();
        imprimirMatriz(matriz1);
        
        
        
    }
    
    public static int[][] definirTamano (int[][]x)
    {
        System.out.println("Ingrese el tamaño de la matriz filas&columnas");
        String datosIngresados=sc.next();
        String[] datos = datosIngresados.split("&");
        
        int filas=Integer.parseInt(datos[0]);
        int columnas=Integer.parseInt(datos[1]);
        
        x=new int[filas][columnas];
        return x;
    }
    
    public static void ingresarValores(int[][] x)
    {
        System.out.println("Ingrese valores de la matriz");
        for(int i=0;i< x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                x[i][j]=Integer.parseInt(sc.next());
            }
        }
        
        
            
    }
    public static void imprimirMatriz(int[][]x)
    {
        for(int i=0;i< x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(x[i][j]);
                
            }
            System.out.println();
        }
    }
    */
        Scanner sc= new Scanner(System.in);
        int q, contador=1; 
        q=sc.nextInt();// entrada de consultas
        if(q<=0||q>=500)
        {
            //System.out.println("Salio");
            System.exit(0);
        }
        do
        {
            //System.out.println("inicio");
            int a,b,n,serie=0; // entrada  a de primer valor de serie, entrada de b que multiplica a toda una serie, n el numero de series
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            int s=a; //asignamos otra variable s=a para poder sumarla en el for
            for(int i=0;i<n;i++){
               s+=Math.pow(2, i)*b; //funcion para elevar a la potencia
               System.out.print(s+ " ");
            }
            System.out.print("\n");
            contador++; //aumenta el numero de veces que se repetira esta accion
        }while(contador<=q);//numero de veces que imprimirá una serie
    
    
    
    
    
    }
    
    
}
