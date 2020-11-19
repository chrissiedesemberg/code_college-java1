/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section3;

/**
 *
 * @author Chrissie
 */
public class ClassExamples {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFirstnumber = (10 + 5) + (2 * 10);

        System.out.println("My first number is : " + myFirstnumber);

        int mySecondNumber = 12;
        int myThirdNumber = myFirstnumber *2;

        System.out.println("My second number is : " + mySecondNumber);
        System.out.println("My third number is : " + myThirdNumber);
        int myTotal = myFirstnumber + mySecondNumber + myThirdNumber;

        System.out.println("My Total is: " + myTotal);
        System.out.println("");

        int myValue = 100000;
        
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        
        System.out.println("myMinValue - Integer: " + myMinValue);
        System.out.println("myMaxValue - Integer: " + myMaxValue);
                System.out.println("");
        
        double myMinValueDouble = Double.MIN_VALUE;
        double myMaxValueDouble = Double.MAX_VALUE;
        
        System.out.println("myMinValue - Double: " + myMinValueDouble);
        System.out.println("myMaxValue - Double: " + myMaxValueDouble);
                System.out.println("");
        
        short myMinValueShort = Short.MIN_VALUE;
        short myMaxValueShort = Short.MAX_VALUE;
        
        System.out.println("myMinValue - Short: " + myMinValueShort);
        System.out.println("myMaxValue - Short: " + myMaxValueShort);
                System.out.println("");
        
        byte myMinValueByte = Byte.MIN_VALUE;
        byte myMaxValueByte = Byte.MAX_VALUE;
        
        System.out.println("myMinValue - Byte: " + myMinValueByte);
        System.out.println("myMaxValue - Byte: " + myMaxValueByte);
                        System.out.println("");
        
    }

}
