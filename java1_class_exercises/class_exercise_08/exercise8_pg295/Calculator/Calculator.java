/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8_pg295.Calculator;

/**
 *
 * @author Chrissie
 */
public final class Calculator {
    public static int sum(int num1, int num2){
    System.out.println("Method One");
    return num1 + num2;
    }
    
    public static float sum(float num1, float num2) {
        System.out.println("Method Two");
        return num1 + num2;
    }
    
    public static float sum(int num1, float num2) {
        System.out.println("Method Three");
        return num1 + num2;
    }
}
