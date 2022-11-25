/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej17;

import java.util.Scanner;

/**
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author ezepl
 */
public class Guia6Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num=0;int dig1=0;int dig2=0;int dig3=0; int dig4=0;int dig5=0;
        int n=leer.nextInt();
     
        int[] vector= new int[n];
        for (int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*100000);
            
            }    
        
        for (int i = 0; i < vector.length; i++) {
            if ( vector[i] >= 0 && vector[i] < 10) {
                 dig1=dig1+1;
            }else if ( vector[i] > 10 && vector[i] < 100){
                 dig2=dig2+1;
            }else if ( vector[i] > 100 && vector[i] < 1000){
                 dig3=dig3+1;
            }else if ( vector[i] > 1000 && vector[i] < 10000){
                 dig4=dig4+1;
            }else if ( vector[i] > 10000 && vector[i] < 100000){
                 dig5=dig5+1;}
       }
     
            System.out.println("Los numeros de 1 digito son "+dig1);
            System.out.println("Los numeros de 2 digitos son "+dig2); 
            System.out.println("Los numeros de 3 digitos son "+dig3);
            System.out.println("Los numeros de 4 digitos son "+dig4);
            System.out.println("Los numeros de 5 digitos son "+dig5);
               
        }
       
    }
    

