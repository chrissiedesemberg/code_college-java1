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
public class ForEach {
    public static void main(String[] args) {
        
        //create array & initialize
        int [] nums = new int[11];
        int i;
        
        for(i = 1; i < nums.length; i++) {
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
        
        // use forEach to display and sum values
        int sum = 0;
        for(int x :nums){
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summary is: " + sum);
        
        //sum only the first 5 elements
        int sum5 = 0;
        for(int x: nums){
            System.out.println("Value is: " + x);
            sum5 += x;
            if (x == 5 ) break;
            }
        
        System.out.println("Summary of first 5: " + sum5);
        

        
        
        
    }
    
    
}
