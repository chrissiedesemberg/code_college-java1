/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Chrissie
 */
public class Inches {
    public static void main(String[] args) {
        long cubicInches;
        long cubicMiles;
        
        cubicMiles = 5280 * 12;
        
        cubicInches = cubicMiles * cubicMiles * cubicMiles;
        
        System.out.println("There are " + cubicInches + " cubic inches in a cubic mile" );
    }
}
