/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extra1;

import java.util.Scanner;

/**
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*
 * @author ezepl
 */
public class Guia6Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir expresado en minutos");
     double min=leer.nextInt();
     double dia=min*1/1440;
        System.out.println("El equivalente al valor ingresado es "  +dia+  "dias");
     
    }
    
}
