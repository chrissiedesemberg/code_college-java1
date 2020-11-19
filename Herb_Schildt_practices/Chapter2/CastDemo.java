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
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;
        
        x = 10.0;
        y = 3.0;
        
        i = (int) (x/y);
        System.out.println("integer outcome of x / y " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b " + b);
        
        i = 257;
        b = (byte) i;
        System.out.println("Value of b " + b);
        
        b = 88;
        ch = (char) b;
        System.out.println("Value of ch " + ch);
    }
   
}
