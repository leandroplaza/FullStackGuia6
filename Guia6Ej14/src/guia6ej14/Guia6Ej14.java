/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej14;

import java.util.Scanner;

/**
 *
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Guia6Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int euros;
       // String libras; String dolar; String yen;
       String opc;
       
        
        
        System.out.println("Ingrese la cantidad a convertir en Euros");
        euros=leer.nextInt();
        System.out.println("Ingrese a que moneda desea convertirla");
        opc=leer.next();
        switch(opc){
            case "libras":
                 System.out.println("La conversion a libras es equivalente a " +conversion(euros,opc)  );
                 break;
            case ("dolar"):
                System.out.println("La conversion a dolares es equivalente a " +conversion(euros,opc) );
                 break;   
            case "yen":
                System.out.println("La conversion a yenes es equivalente a " +conversion(euros,opc) );
                break;
        }
    }
 public static double conversion(double euros, String opc ){
double retorno;
retorno=0;     
     
     
     switch(opc){
case "libras": 
    retorno=euros*0.86;
    break;
case "dolar": 
    retorno=euros*1.28611;
    break;
case "yen":
    retorno=euros*129.852;
    break;
}    
     return retorno;
 }       
}       
        
        
 