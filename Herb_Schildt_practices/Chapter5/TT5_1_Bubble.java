/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author Chrissie
 */
public class TT5_1_Bubble {
    
    public static void main(String[] args) {
        
        int nums [] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int size = 10;
        int a,b,t;
        
        System.out.println("Original array: ");
        for ( int i = 0; i < size; i++) {
            System.out.print(" " + nums[i] + ", ");
        }
        System.out.println("");
        System.out.println("");   
        
        for (a=1; a < size; a++)
             for(b= size-1; b >= a; b--) {
                 if(nums[b-1] > nums[b]) {
                 t = nums[b-1];
                 nums[b-1] = nums[b];
                 nums[b] = t;
                 }
             }
        
        System.out.println("Modified array: ");
        for ( int i = 0; i < size; i++) {
            System.out.print(" " + nums[i] + ", ");
        }
        System.out.println("");
        System.out.println("");   
        
    }
}
