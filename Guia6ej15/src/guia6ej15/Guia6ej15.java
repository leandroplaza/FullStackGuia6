/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej15;

import java.util.Scanner;

/**
 *
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Guia6ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int i;
        int[] vector= new int[100];
       for (i=0;i<100;i++){
           vector[i]= i +1;

       }
       for (i=99;i>=0;i--){    
           System.out.println(vector[i]);
        
    }
    
}
}