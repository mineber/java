/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.julio;
import static com.mycompany.julio.Metodos.division;
import static com.mycompany.julio.Metodos.suma;
import static com.mycompany.julio.Metodos.resta;
import static com.mycompany.julio.Metodos.mult;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author abermejom
 */
public class App {

        static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Elige la operación");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int operacion = 0;
        try {
             operacion = s.nextInt();
        
        System.out.println("Escribe el primer número");
        int num1 = s.nextInt();
        System.out.println("Escribe el segundo número");
        int num2 = s.nextInt();
        if(operacion == 1){
         System.out.println("El resultado es igual a"+ suma(num1, num2));
        } else if (operacion == 2){
         System.out.println("El resultado es igual a "+ resta(num1, num2));
        }else if (operacion == 3){
         System.out.println("El resultado es igual a "+ mult(num1, num2));
        }else if (operacion == 4){
            
         System.out.println("El resultado es igual a "+ division(num1, num2));
        }else{
            System.out.println("Operación no válida");
            
        }
        
        } catch (InputMismatchException ex) {
            System.out.println("Debes elegir con números.");
            
        }
        
    }
}
