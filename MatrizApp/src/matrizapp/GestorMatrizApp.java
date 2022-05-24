/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizapp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorMatrizApp {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();
        int filas=6,columnas=6;
        int matriz[][]= new int[filas][columnas];
        
        //lena con numeros aleatorios la matriz
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=random.nextInt(9);
            }
        }
        matriz[1][0]=0;
        matriz[1][2]=0;
        matriz[1][3]=0;
        matriz[1][5]=0;
        matriz[4][0]=0;
        matriz[4][2]=0;
        matriz[4][3]=0;
        matriz[4][5]=0;
        //imprime la matriz
        String respuesta= "";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
               respuesta=respuesta+" "+matriz[i][j]; 
            }
            respuesta= respuesta+"\n";
        }
        System.out.println(respuesta);
        
        //suma de submatrices
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = matriz[i][j] + 
                    matriz[i][j+1] +
                    matriz[i][j+2] +
                    matriz[i+1][j+1] +
                    matriz[i+2][j] +
                    matriz[i+2][j+1] +
                    matriz[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        
        
        
        
    }
    
}
