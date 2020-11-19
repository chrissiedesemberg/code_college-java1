/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Chrissie
 */
public class CodingExercises {

    public static void main(String[] args) {
        // Coding Exercise 1: Speed Converter
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        System.out.println("");
        System.out.println("");

        //Coding Exercise 2: MegaBytes Converter
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        System.out.println("");
        System.out.println("");

        //Coding Exercise 3: Barking dog
        boolean result = shouldWakeUp(true, 1);
        System.out.println("Dog barking: " + result);
        result = shouldWakeUp(false, 2);
        System.out.println("Dog barking: " + result);
        result = shouldWakeUp(false, 8);
        System.out.println("Dog barking: " + result);
        result = shouldWakeUp(false, -1);
        System.out.println("Dog barking: " + result);
        System.out.println("");
        System.out.println("");

        // Coding Exercise 4: Leap Year Calculator
        boolean leapYearOrNot = isLeapYear(-1600);
        System.out.println("Is Leap Year? " + leapYearOrNot);
        leapYearOrNot = isLeapYear(1600);
        System.out.println("Is Leap Year? " + leapYearOrNot);
        leapYearOrNot = isLeapYear(2017);
        System.out.println("Is Leap Year? " + leapYearOrNot);
        leapYearOrNot = isLeapYear(2000);
        System.out.println("Is Leap Year? " + leapYearOrNot);
        leapYearOrNot = isLeapYear(1924);
        System.out.println("Is Leap Year? " + leapYearOrNot);

        System.out.println("");
        System.out.println("");

        // Coding Exercise 5: Decimal Comparator
        boolean decimalComparatorResult = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("Decimal Comparator : " + decimalComparatorResult);
        decimalComparatorResult = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Decimal Comparator : " + decimalComparatorResult);
        decimalComparatorResult = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("Decimal Comparator : " + decimalComparatorResult);
        decimalComparatorResult = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("Decimal Comparator : " + decimalComparatorResult);
        System.out.println("");
        System.out.println("");
        // Coding Exercise 6: Equal Sum Checker

        boolean equalSumResult = hasEqualSum(1, 1, 1);
        System.out.println("Equal Sum Result: " + equalSumResult);
        equalSumResult = hasEqualSum(1, 1, 2);
        System.out.println("Equal Sum Result: " + equalSumResult);
        equalSumResult = hasEqualSum(1, -1, 0);
        System.out.println("Equal Sum Result: " + equalSumResult);
        System.out.println("");
        System.out.println("");

        // Coding Exercise 7: Teen number checking
        boolean teenResult = hasTeen(9, 99, 19);
        System.out.println("You have a teenager: " + teenResult);
        teenResult = hasTeen(23, 15, 42);
        System.out.println("You have a teenager: " + teenResult);
        teenResult = hasTeen(22, 23, 34);
        System.out.println("You have a teenager: " + teenResult);
        boolean isTeenResult = isTeen(22);
        System.out.println("You have a teenager: " + isTeenResult);
        isTeenResult = isTeen(13);
        System.out.println("You have a teenager: " + isTeenResult);
        System.out.println("");
        System.out.println("");

        // Coding Exercise 8: Area Calculator
        double circleArea = area(5.0);
        System.out.println("Circle Area: " + circleArea);
        circleArea = area(-1);
        System.out.println("Circle Area: " + circleArea);
        double rectangleArea = area(5.0, 4.0);
        System.out.println("Rectangle Area: " + rectangleArea);
        rectangleArea = area(-1.0, 4.0);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("");
        System.out.println("");

        // Coding Exercise 9: Minutes To Years and Days Calculator
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(-561600);
        System.out.println("");
        System.out.println("");

        // Coding Exercise 10: Equality Printer
    
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
                System.out.println("");
        System.out.println("");
    
        // Coding Exercise 11: Playing Cat
        boolean isCatPlayingResult = isCatPlaying(true, 10);
        System.out.println("Cat is playing: " + isCatPlayingResult);
        isCatPlayingResult = isCatPlaying(false, 36);
        System.out.println("Cat is playing: " + isCatPlayingResult);
        isCatPlayingResult = isCatPlaying(false, 35);
        System.out.println("Cat is playing: " + isCatPlayingResult);
        
    }

    // Methods
    
         // Coding Exercise 11: Playing Cat   
    
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (
                (summer && (temperature >= 25 && temperature <= 45))
                ||
                (!summer && (temperature >= 25 && temperature <= 35))
                ) return true;
        else return false; 
    }
    
    
    // Coding Exercise 10: Equality Printer
    
    public static void printEqual(int n1, int n2, int n3) {
        if ( n1 < 0 || n2 < 0 || n3 < 0) System.out.println("Invalid Value");
        else {
            if( n1 == n2 && n2 == n3) System.out.println("All numbers are equal");
            else if ( n1 != n2 && n2 != n3 && n3 != n1 && n3 != n2) System.out.println("All numbers are different");
            else System.out.println("Neither all are equal or different");   
        }
    }
    
    
    // Coding Exercise 9: Minutes To Years and Days Calculator
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long days = minutes / 60 / 24;
            long years = days / 365;
            long remainderDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
        }
    }

    // Coding Exercise 8: Area Calculator
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        double rectangleArea = x * y;
        return rectangleArea;
    }

    // Coding Exercise 7: Teen number checking
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if ((ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int n) {
        if (n >= 13 && n <= 19) {
            return true;
        } else {
            return false;
        }
    }

    // Coding Exercise 6: Equal Sum Checker
    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
        if ((numOne + numTwo) == numThree) {
            return true;
        } else {
            return false;
        }

    }

    // Coding Exercise 5: Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {

        if ((int) (numOne * 1000) == (int) (numTwo * 1000)) {
            return true;
        } else {
            return false;
        }
    }

    // Coding Exercise 4: Leap Year Calculator
    public static boolean isLeapYear(int year) {
        boolean leap = false;

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leap = true;
                        return leap;
                    } else {
                        leap = false;
                        return leap;
                    }
                } else {
                    leap = true;
                    return leap;
                }
            }
            return leap;
        } else {
            return leap;
        }

    }

// Coding Exercise 3: Barking dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking && hourOfDay >= 0 && hourOfDay <= 23) {
            if ((hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Coding Exercise 2: MegaBytes Converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int MB = kiloBytes / 1024;
        int remainderKB = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + remainderKB + " KB");
        }
    }

    // Coding Exercise 1: Speed Converter
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milesPerHour = (long) (Math.round((kilometersPerHour / 1.609)));
            return milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHourResult = toMilesPerHour(kilometersPerHour);

        if (milesPerHourResult < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHourResult + " mi/h");
        }
    }

}
