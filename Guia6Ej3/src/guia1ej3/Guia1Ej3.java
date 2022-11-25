/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej3;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author ezepl
 */
public class Guia1Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase;
        frase=leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
    }
    
}
