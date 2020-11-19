/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Arrays;

/**
 *
 * @author Chrissie
 */
public class Test_SelfTest {

    public static void main(String[] args) {
        System.out.println("Question 1 \n\n");
//        1. Show two ways to declare a onedimensional array of 12 doubles.
        //1  type arrayName [] = new type[size];
        //2  type arrayName[];
        // arrayName = new type[size];
//        2. Show how to initialize a onedimensional array of integers to the values 1 through 5.

        System.out.println("\n\n");
        System.out.println("Question 2 \n\n");
        int oneD[] = new int[6];
        int i;

        for (i = 1; i <= 5; i = i + 1) {
            oneD[i] = i;
        }

        for (i = 1; i <= 5; i = i + 1) {
            System.out.println("This is oneD[" + i + "]: " + oneD[i]);
        }

        System.out.println("\n\n");
//        3. Write a program that uses an array to find the average of 10 double 
//          values. Use any 10 values you like.
        System.out.println("Question 3 \n\n");

        double average[] = {99.0, -10.0, 100123.0, 18.0, -978.0, 5623.0, 463.0, -9.0, 287.0, 49.0};
        int c;
        double total = 0;

        for (c = 0; c < average.length; c++) {
            total = total + average[c];
        }

        System.out.println("The total is: " + total + "\n\n");
        System.out.println("The average.length is: " + average.length + "\n\n");
        System.out.println("The average of the sum of the array is: " + (total / (average.length)));

//        4. Change the sort in Try This 51 so that it sorts an array of strings. Demonstrate that
//        it works.
        System.out.println("\n\n");
        System.out.println("Question 5 \n\n");
//        5. What is the difference between the String methods indexOf( ) and lastIndexOf(
//        )?

        // indexOf() gets the first index in the array where the String is located
        // lastIndexOf() gets the last index in the array where the String is located
        System.out.println("\n\n");
        System.out.println("Question 6 \n\n");

//        6. Since all strings are objects of type String, show how you can call the length( ) and
//        charAt( ) methods on this string literal: "I like Java".
        String string1 = "I like Java";

        int lengthOfString6 = string1.length();
        System.out.println("The length of the string \" I like Java \" is : " + lengthOfString6);

        char characterAt = string1.charAt(3);
        System.out.println("Character at index 3 of the string \" I like Java \" is : " + characterAt);

        System.out.println("\n\n");
        System.out.println("Question 7 \n\n");
//        7. Expanding on the Encode cipher class, modify it so that it uses an eightcharacter
//        string as the key.

        String msg7 = "This is a test";
        String enmsg7 = "";
        String demsg7 = "";
        String key7 = "abcdefgh";
        int j7;

        System.out.println("Original message: ");
        System.out.println(msg7);

        //encode the message
        j7 = 0;
        for (int i7 = 0; i7 < msg7.length(); i7++) {
            enmsg7 = enmsg7 + (char) (msg7.charAt(i7) ^ key7.charAt(j7));
            j7++;
            if (j7 == 8) {
                j7 = 0;
            }
        }

        System.out.println("Encoded msg: \n" + enmsg7 + "\n\n");

        //decode the message
        j7 = 0;
        for (int i7 = 0; i7 < msg7.length(); i7++) {
            demsg7 = demsg7 + (char) (enmsg7.charAt(i7) ^ key7.charAt(j7));
            j7++;
            if (j7 == 8) {
                j7 = 0;
            }
        }
        System.out.println("Decoded msg: " + demsg7 + "\n\n");

        System.out.println("\n\n");
        System.out.println("Question 8 \n\n");

//        8. Can the bitwise operators be applied to the double type?
        System.out.println("No, it cant be applied to double, long or floats");

        System.out.println("\n\n");
        System.out.println("Question 9 \n\n");
//        9. Show how this sequence can be rewritten using the ? operator.
//                if(x < 0) y = 10;
//                else y = 20;

        System.out.println("x < 0 ? y = 11 : y = 20");

        System.out.println("\n\n");
        System.out.println("Question 10 \n\n");
//        10. In the following fragment, is the & a bitwise or logical operator? Why?

        System.out.println("It is a logical operator because the variables were set as booleans."
                + "Bitwise is used to switch on bits ");

        System.out.println("\n\n");
        System.out.println("Question 11 \n\n");
//        11. Is it an error to overrun the end of an array? Is it an error to index an array with a
//        negative value?

        System.out.println("Yes, it runs the code, but when it reaches the end it gives an array out of bounds error");
        System.out.println("Both gives array out of bounds errors");

        System.out.println("\n\n");
        System.out.println("Question 12 \n\n");
//        12. What is the unsigned rightshift operator?
        System.out.println(">>> It is always shifts 0 to the left of the bit pattern.");

        System.out.println("\n\n");
        System.out.println("Question 13 \n\n");
//        13. Rewrite the MinMax class shown earlier in this chapter so that it uses a foreach
//        style for loop.
        int nums13[] = new int[10];
        int min, max;

        nums13[0] = 99;
        nums13[1] = -10;
        nums13[2] = 100123;
        nums13[3] = 18;
        nums13[4] = -978;
        nums13[5] = 5623;
        nums13[6] = 463;
        nums13[7] = -9;
        nums13[8] = 287;
        nums13[9] = 49;

        min = max = nums13[0];
        // Use a for-each style for loop.
        for (int a13 : nums13) {
            if (a13 < min) {
                min = a13;
            }
            if (a13 > max) {
                max = a13;
            }
        }
        System.out.println("min and max: " + min + " " + max);

        System.out.println("\n\n");
        System.out.println("Question 14 \n\n");
//        14. Can the for loops that perform sorting in the Bubble class shown in Try This 51
//        be converted into foreach style loops? If not, why not?
        System.out.println("No it cant - you would get an out of bounds error.");

        System.out.println("\n\n");
        System.out.println("Question 15 \n\n");
//        15. Can a String control a switch statement?
        System.out.println("Yes");

        System.out.println("\n\n");
        System.out.println("Question 16 \n\n");
//        16. What type name is reserved for use with local variable type inference?
        System.out.println("var.");
        System.out.println("\n\n");
        System.out.println("Question 17 \n\n");
//        17. Show how to use local variable type inference to declare a boolean variable called
//        done that has an initial value of false.

        var answer = false;
        System.out.println(answer);

        System.out.println("\n\n");
        System.out.println("Question 18 \n\n");
//        18. Can var be the name of a variable? Can var be the name of a class?
        System.out.println("Yes it can, but it would be confusing - and no it cannot be the same name as the class");

        System.out.println("\n\n");
        System.out.println("Question 19 \n\n");
//        19. Is the following declaration valid? If not, why not.
        System.out.println("Yes it is");
        System.out.println("\n\n");
        System.out.println("Question 20 \n\n");
//        20. Is the following declaration valid? If not, why not?
        System.out.println("No it is not, it has to be initialized.");

        System.out.println("\n\n");
        System.out.println("Question 21 \n\n");
//        21. In the show( ) method of the ShowBits class developed in Try This 53,
//        the local variable mask is declared as shown here:
//        Change this declaration so that it uses local variable type inference. When doing so, be
//        sure that mask is of type long (as it is here), and not of type int.

        System.out.println("var mask = 1L;");
    }

}
