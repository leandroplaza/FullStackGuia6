/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej11;

import java.util.Scanner;

/**
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * @author ezepl
 */
public class Guia1Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1; int num2;
        String resp;
        int opc;
        num1= leer.nextInt();
        num2=leer.nextInt();
        
        resp=("n");
        while (!resp.equals("s")){
            System.out.println("Ingrese una opcion del 1 al 5");
            System.out.println("1: SUMAR");
            System.out.println("2: RESTAR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("5: SALIR");
            opc=leer.nextInt();
          
            switch (opc){
            
            case 1:
                System.out.println("Ha elegido suma. El resultado es " +(num1+num2));
                break;
            case 2:
                System.out.println("Ha elegido resta. El resultado es " +(num1-num2));
                break;
            case 3:
                System.out.println("Ha elegido multiplicar. El resultado es " +(num1*num2));
                break;
            case 4:
                System.out.println("Ha elegido dividir. El resultado es " +(num1/num2));
                break;
            case 5:
                System.out.println("Desea salir? Coloque S si quiere salir o N si desea ver nuevamente el menu");
                    resp=leer.next();
                    break;
            default: System.out.println("La opcion ingresada no es correcta. Intentelo nuevamente");        
                
                }
        }
                
        
    }
    
}
