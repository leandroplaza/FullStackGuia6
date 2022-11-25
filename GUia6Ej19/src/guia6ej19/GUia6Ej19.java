/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej19;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se
 * dice que una matriz A es anti simétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 *
 *
 * @author ezepl
 */
public class GUia6Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int matriz2[][] = new int[n][n];
        boolean verd=true;

        int matriz[][] = new int[n][n];
        System.out.println("Ingrese los valores de los elementos de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = leer.nextInt();
//            System.out.print(" " +matriz[i][j]);

            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print(" "+matriz[i][j]);
                
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz2[i][j] = (matriz[j][i]);
                System.out.print(" " + matriz2[i][j]);
                if (matriz[i][j]!=matriz2[i][j]*-1) {
                   verd=false;
                }
            }
            System.out.println("");
        }
        if (verd==true) {
        System.out.println("La matriz es antisimetrica"); 
        
        }else{ 
            System.out.println("La matriz no es antisimetrica");
        }
    }
}
