/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej8;

import java.util.Scanner;
/**
 *
 * @author ezepl
 */
public class Guia1Ej8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase; 
       String subcadena;
       
       frase= leer.nextLine();
       if (frase.substring(0,1).equalsIgnoreCase("A")){
           System.out.println("Correcto");
       }else 
            System.out.println("Incorrecto");
        
    }
    }
    
