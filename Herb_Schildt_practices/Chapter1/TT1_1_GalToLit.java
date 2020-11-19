/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author Chrissie
 */
public class TT1_1_GalToLit {
    public static void main(String[] args) {
        double gallons;
        double liters;
        //There are 3.7854 liters in a gallon. Thus, to convert gallons to liters, the gallon value is multiplied by 3.7854.
        
        gallons = 10;
        liters = gallons * 3.7854;
        
        System.out.println("If I have " + gallons + " gallons. That would be equal to " + liters + " liters.");
    }
}
