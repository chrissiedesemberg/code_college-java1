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
public class exercise_5_1_pg111 {
    public static void main(String[] args) {
        double price = 12.20, tax = 0.12;
        int quantity = 2;
        double total = (price + tax) * quantity;
        boolean outOfStock = false;
        String custName = "John Doe", itemDesc = "shoe lace";
        String message = (custName + " wants to buy " + quantity + " of " + itemDesc);
        
        if (quantity > 1) {
        System.out.println(message + "s");
}
        else if (quantity == 1) {
        System.out.println(message);
}
        else {
        outOfStock = true;
        System.out.println(itemDesc + "s are currently out of stock.");
}
    }
        
}
