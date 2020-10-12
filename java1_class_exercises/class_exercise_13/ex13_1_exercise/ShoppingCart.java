package exercise_13.ex13_1_exercise;
import java.util.*;
import java.io.*;


public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        ArrayList <String> newDays = new ArrayList <String> (Arrays.asList(days));
        
        // Loop through the ArrayList, printing out "sunday" elements in 
       for (String day : newDays) {
           if (day.equals("sunday")) {
               System.out.println(day.toUpperCase());
       }
           else {
                System.out.println(day);
           }
           
        }
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  



    }    
}
