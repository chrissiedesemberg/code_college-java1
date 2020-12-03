/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.CodingExercise33_CarpetCostCalculator;

/**
 *
 * @author Chrissie
 */
public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {

        if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else if (width < 0) {
            this.width = 0;
        } else if (length < 0) {
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    
    public double getArea() {
       
        return this.width * this.length;
    }

}
