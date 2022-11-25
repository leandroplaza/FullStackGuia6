/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej16;

import java.util.Scanner;

/**
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author ezepl
 */
public class Guia6Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
     
        int[] vector= new int[n];
        for (int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*10);   
        }    
        System.out.println("Ingrese el numero a buscar");
        int num=leer.nextInt();
        boolean pos=true;
        for (int i = 0; i < vector.length; i++) {
            if (num==vector[i]){
                int posicion=i;
                pos=false;
                System.out.println("el numero se encuentra en la posicion"+posicion);
            }else if (i==vector.length-1 && pos==true){
                System.out.println("El numero a buscar no se encuentra en el vector");
        
      
    }
           
                
            }
   
            for (int i = 0; i <vector.length ; i++) {
                System.out.println(vector[i]);
            }
}
}