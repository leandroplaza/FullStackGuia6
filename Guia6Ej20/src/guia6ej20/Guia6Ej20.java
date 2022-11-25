/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej20;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author ezepl
 */
public class Guia6Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int sumadiagp = 0;
        int sumafila = 0;
        int sumacol = 0;
        int sumadiags = 0;
        int comp = 0;
        int ok = 0;
        System.out.println("Ingrese los valores de los elementos de la matriz de 1 a 9 ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        System.out.println("Los valores ingresados no respetan los parametros");
                    }

                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    comp += matriz[i][j];

                }
                if (i == j) {
                    sumadiagp += matriz[i][j];
                }
                sumafila += matriz[i][j];
                sumacol += matriz[j][i];
                if (i == 2 - j) {
                    sumadiags += matriz[i][j];
                }
                
                
            }
            if (sumafila == comp && sumacol == comp) {
                    ok++;
                }
            sumafila = 0;
            sumacol = 0;
        }  
        
            if (sumadiagp == comp && sumadiags == comp) {
                ok++;
            }

            if (ok == 4) {
                System.out.println("LA MATRIZ ES MAGICA!!!!!");

            } else {
                System.out.println("La matriz no es magica");
            }

        

    }
}
