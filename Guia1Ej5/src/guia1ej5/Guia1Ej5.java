/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej5;

import java.util.Scanner;
 import java.lang.Math;

    
/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Guia1Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reed= new Scanner(System.in);  
       
        System.out.println("Ingrese un numero"); 
        int num;
        double raiz;
        num=reed.nextInt();
        raiz= Math.sqrt(num);
        System.out.println("El doble del numero ingresado es " +num*2);
        System.out.println("El triple del numero ingresado es" +num*3);
        System.out.println("La raiz del numero ingresado es" +raiz);
        
    }
   
            
            
}
