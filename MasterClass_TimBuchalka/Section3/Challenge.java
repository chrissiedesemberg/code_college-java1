/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section3;

/**
 *
 * @author Chrissie
 */
public class Challenge {
    
    public static void main(String[] args) {
        
        System.out.println("Challenge 1: ");
        byte varByte = 100;
        short varShort = 1000;
        int varInteger = 100000;
        
        long total = 50000L + ((varByte + varShort + varInteger) * 10L);
        
        System.out.println("Total is: " + total);
        
        short shortTotal = (short) (50000 + ((varByte + varShort + varInteger) * 10));
        
        System.out.println("Short total is: " + shortTotal);
        
        System.out.println("");
        System.out.println("");
        
                
        System.out.println("Challenge 2: ");
        
        double pounds = 200;
        double kilograms = pounds * 0.45359237;
        
        System.out.println("Kilograms: " + kilograms);
        
        System.out.println("Challenge 3: ");
        
        double val1 = 20.00;
        double val2 = 80.00;
        double challenge3Total = (val1 + val2) * 100;
        System.out.println(challenge3Total);
        double remainder = challenge3Total % 40.00;
        boolean result = (remainder == 0) ? true : false;
        System.out.println("challenge3Total has remainder: " + result);
        if (!result)
            System.out.println("Got some remainder");
        
        
        
    }
    
}
