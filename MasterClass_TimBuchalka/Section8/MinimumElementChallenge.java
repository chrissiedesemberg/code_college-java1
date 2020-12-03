/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class MinimumElementChallenge {
    
    public static void main(String[] args) {
        
        findMin(readIntegers(5));
        
    }
    
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static int[] readIntegers(int count) {
        int[] numbers = new int[count];
        System.out.println("Enter " + count + " numbers:\r");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    
    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
            minValue = array[i];}
        }
        System.out.println("Minimum value: " + minValue);
        return minValue;
    }
    
    
}
