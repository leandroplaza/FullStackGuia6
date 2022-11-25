/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej4;

import java.util.Scanner;

/**
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Guia1Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la temperatura en unidad centigrados");
        double grados;
        double f;
        grados=leer.nextDouble();
        f=(grados*1.8)+32;
        System.out.println("El equivalente en Fahrenheit es "+f );
        
    }
    
}
