/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author Chrissie
 */
public class TwoDShape {

    private double width;
    private double height;

    // A default constructor. 
    TwoDShape() {
        width = height = 0.0;
    }

    // Parameterized constructor. 
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height. 
    TwoDShape(double x) {
        width = height = x;
    }

    // Accessor methods for width and height. 
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are "
                + width + " and " + height);
    }
}
