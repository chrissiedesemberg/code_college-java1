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


public class ReverseArrayChallenge {

    public static void main(String[] args) {
     
        reverse(initializeArray(10));
    }
  
    public static int[] initializeArray(int count) {
    
        int[] numbers = new int[count];
        for (int i=1; i < count; i++) {
            numbers[i] = i;
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
        return numbers;
    }
    
    public static void reverse(int[] array){
       System.out.println("array length " + array.length);
       
       int maxIndex = array.length-1;
       int halfWay = array.length / 2;

        for (int i = 0; i < halfWay; i++){
                int temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
        }
        
        System.out.println("reversed array: " + Arrays.toString(array) );
    }}
    

