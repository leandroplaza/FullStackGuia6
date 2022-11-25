/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej12;

import java.util.Scanner;

/**
 *
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
public class Guia6Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       String frase;
       int cont;int cad;int cant;int mal;int corr;
      mal=0;
      cad=0; 
     corr=0;
     frase="n";
      
       
        System.out.println("Ingrese una frase");
       while (!frase.equals("&&&&&")){
           frase=leer.nextLine();
           cant= frase.length();
           
           if (cant!=5){
               System.out.println("La frase debe contener 5 caracteres, ingresela nuevamente");
               mal=mal+1;
               
           }else if  (frase.substring(0,1).equalsIgnoreCase("X")&&frase.substring(4,5).equalsIgnoreCase("O")){
                System.out.println("Esta escritura es correcta");
                corr=corr+1;
            }else if (frase.equals("&&&&&")){
                   System.out.println("Ha ingresado los caracteres correctos, Gracias");
                   corr=corr+1;
                   System.out.println("Los ingresos incorrectos fueron "+ mal);
                   System.out.println("Los ingresos correctos fueron "+ corr);
            }else{  
                System.out.println("La escritura ingresada no respeta el formato");
                mal=mal+1;
       }
          
    }       
    }
}

   
            
               
               
               
               
               
               
           
       
       
       
       
       
       
        
       
    
    

