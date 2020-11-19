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
public class TT1_2_GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        
        gallons = 0;
        String word = "gallon ";
        
        for (counter = 1; counter < 101; counter++){
            gallons++;
            liters = gallons * 3.7854;
            if (counter % 10 == 0) {
                System.out.println("");
            }
            else {
                if (gallons > 1){
                word = "gallons";
                }
            }
            System.out.println(counter + " | " + gallons + " " + word + " | "+ liters + " Liters");
    }
    }}

