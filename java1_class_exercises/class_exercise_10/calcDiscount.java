/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_10;

/**
 *
 * @author Chrissie
 */
public class calcDiscount {
//    Nonprofits get a discount of 10% if total > 900, else 8%.
//• Private customers get a discount of 7% if total > 900, else
//no discount.
//• Corporations get a discount of 8% if total > 500, else 5%.
//    
    public static void main(String[] args) {
    String client1 = "NonProfits";
    String client2 = "Private Customers";
    String client3 = "Corporations";
    int total;
    int discount;
    
    if (client1) {
        if(total > 900) {
            discount = 10;
        }
        else {
            discount = 8;
        }   
    }
    else if (client2) {
        if(total > 900) {
            discount = 7;
        }
        else {
            discount = 0;
        }   
    }
    else {
        if(total > 500) {
            discount = 8;
        }
        else {
            discount = 5;
        }   
}
    }

}
    
