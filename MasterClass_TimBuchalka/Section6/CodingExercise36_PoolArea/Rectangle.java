/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.CodingExercise36_PoolArea;

/**
 *
 * @author Chrissie
 */
public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else if (width < 0) {
            this.width = 0;
            this.length = length;
        } else if (length < 0) {
            this.width = width;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    
    public double getArea() {
        return width * length;
    }
   

}
