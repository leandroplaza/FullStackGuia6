/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej21;

import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class Guia6Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ok = 0;
        boolean no = false;
        int comp = 0;
        int matrizA[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + matrizA[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Ingrese los valores de la matriz chica para comprobar");
        int matrizB[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = leer.nextInt();

            }
        }
        int fila=0;int columna=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                comp = 0;

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (matrizB[k][l] == matrizA[i + k][j + l]) {

                            comp++;
                        }
                        if (comp == 9) {
                            fila=i;
                            columna=j;
                            no = true;
                            break;
                        }

                    }
                    if (no) {
                        break;
                    }
                }
                if (no) {
                    break;
                }
            }
            if (no) {
                break;
            }
        }
        System.out.println(comp);
        System.out.println();
        if (no) {
            System.out.println(" es verdadero");
        }
        if (comp == 9) {
            System.out.println("La matriz B se encuentra contenida en la matriz A en la fila columna, en la fila"+ fila+ "y en la columna"+ columna);
        } else {
            System.out.println("La matriz B no se encuentra contenida en la matriz A");
        }
    }
}
