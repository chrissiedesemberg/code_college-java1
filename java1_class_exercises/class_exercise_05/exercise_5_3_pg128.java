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
public class exercise_5_3_pg128 {
    public static void main(String[] args) {
       
        double price = 12.20, tax = 0.12;
        int quantity = 1;
        double total = (price + tax) * quantity;
        boolean outOfStock = false;
        String custName = "John Doe";
        String [] items = {"shirt", "socks", "pants", "scarf"};
        int [] itemPrices = {12,11,15,25};

        String message = (custName + " wants to buy " + quantity);
        
        System.out.println(message + " " + items[3]);

        for (int unitPrice : itemPrices) {
            System.out.println("Item price is " + unitPrice);
        }
    }
}
