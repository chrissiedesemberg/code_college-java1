/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Chrissie
 */
public class exercise_4_2_pg99 {
    public static void main(String[] args) {
        double price = 12.20, tax = 0.12;
        int quantity = 12;
        double total;
        total = (price + tax) * quantity;
        
        System.out.println("The price (incl tax) per item is: " + (price + tax) +
                ". If you buy " + quantity + " items, your total will be: " + total);
    }
}
