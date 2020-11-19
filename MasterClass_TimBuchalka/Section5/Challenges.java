/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5;

import java.util.Scanner;

/**
 *
 * @author Chrissie
 */
public class Challenges {
    public static void main(String[] args) {
        
        //Switch #62
        
         char value = 'G';
         
         switch(value) {
            case 'A': 
                 System.out.println("Typed value 'A'");
                 break;
            case 'B': 
                 System.out.println("Typed value 'B'");
                 break;
            case 'C': 
                 System.out.println("Typed value 'C'");
                 break;
            case 'D': 
                 System.out.println("Typed value D'");
                 break;
            default:
                System.out.println("Typed not found");
                break;
         }
         System.out.println("");
         System.out.println("");
         
         // #63 Day of the week
         
        printDayOfTheWeek(4);
        dayofTheWeekChallenge(6);
         System.out.println("");
         System.out.println("");
         
        // # 66 for Statement
        
        int forStatement = sum();
        System.out.println(forStatement);
                 System.out.println("");
         System.out.println("");
         
         // # 69 Sum Challenge 
         
         System.out.println("Sum of digits in 125: " + sumDigits(125));
         System.out.println("Sum of digits in -125: " + sumDigits(-125));
         System.out.println("Sum of digits in 4: " + sumDigits(4));
         System.out.println("Sum of digits in 32913: " + sumDigits(32123));
         System.out.println("");
         System.out.println("");
         
    // # 73 Reader input challenge 
        
        
        
         
    }
     
    
    // # 73 Reader input challenge 
    
    public static int readerSum(int number) {
    
    Scanner sumScan = new Scanner(System.in);
    
        System.out.println("Enter numbers");
    
    }
    
    // # 69 Sum Challenge 
        public static int sumDigits(int number){
           
            int sum = 0;
           
            if (number < 10 || number < 0) return -1;
            
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                
                number /= 10;
            }
            
            return sum;
  
        }
    
    
    
// # 66 for Statement
        public static int sum(){
        int sum = 0;
        int count = 0;
        for(int i = 1; i < 1000; i++) {
            if( i % 3 == 0 && i % 5 == 0){
               count++;
               sum += i;
               System.out.println("Number found: " + i);
               if (count == 5) {
               break;}
            }
        }
        return sum;
        }
        // # 63 Day of the week
    
            public static void printDayOfTheWeek(int day) {

            switch(day) {
            case 0: 
                 System.out.println("Sunday");
                 break;
            case 1: 
                 System.out.println("Monday");
                 break;
            case 2: 
                 System.out.println("Tuesday");
                 break;
            case 3: 
                 System.out.println("Wednesday");
                 break;
                             case 4: 
                 System.out.println("Thursday");
                 break;
            case 5: 
                 System.out.println("Friday");
                 break;
            case 6: 
                 System.out.println("Saturday");
                 break;
     
            default:
                System.out.println("Invalid day");
                break;
         }
            
            }
            
        public static void dayofTheWeekChallenge(int day){
            if ( day == 0 ) System.out.println("Sunday");
            else if ( day == 1) System.out.println("Monday");
            else if ( day == 2) System.out.println("Tuesday");
            else if ( day == 3) System.out.println("Wednesday");
            else if ( day == 4) System.out.println("Thursday");
            else if ( day == 5) System.out.println("Friday");
            else if ( day == 6) System.out.println("Saturday");
            else System.out.println("Invalid day");
            System.out.println("");
            System.out.println("");
        }
        
       
        
        
       
    
    
    
}
