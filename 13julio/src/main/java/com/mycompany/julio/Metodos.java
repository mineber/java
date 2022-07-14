/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.julio;

/**
 *
 * @author abermejom
 */
public class Metodos {
    public static int suma(int a, int b) {
        int suma = a + b;
        return suma;
    }
    public static int resta(int a, int b) {
        
        int resta = a - b;
        return resta;
    }
    public static int mult(int a, int b) {

        int mult = a * b;
        return mult;
    }
    public static String division(int a, int b) {
        if (b == 0){
            return "Error, no se puede dividir entre 0";
        } else{
        int division = a / b;
        
        return String.valueOf(division);}
    }
}

