/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Chrissie
 */
public class exercise13_1 {
        public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        List<String> myList = Arrays.asList(days);
        ArrayList<String> myArrayList = new ArrayList(myList);
        System.out.println(myArrayList);
        
        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class) 
        for (String day : days) {
            if (day == "sunday"){
                day.toUpperCase();
                System.out.println(day);
            }
            else {
                day.toLowerCase();
                System.out.println(day);
            }
        }
        
        // Print all other days in lower case 
        // Print out the ArrayList  
        System.out.println(days);



    }    
}
