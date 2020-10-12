/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Chrissie
 */
public class exercise_5_2_pg121 {
    public static void main(String[] args) {
        
        //Declare and initialize a String array to hold four distinct String values.
        double price = 12.20, tax = 0.12;
        int quantity = 1;
        double total = (price + tax) * quantity;
        boolean outOfStock = false;
        String custName = "John Doe";
        String [] items = {"shirt", "socks", "pants", "scarf"};

        String message = (custName + " wants to buy " + quantity);
        
        System.out.println(message + " " + items[4]);

                
    }
        
}
