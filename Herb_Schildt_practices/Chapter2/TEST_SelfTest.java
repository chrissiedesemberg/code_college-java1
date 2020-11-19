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
public class TEST_SelfTest {
    
//    1. Why does Java strictly specify the range and behavior of its primitive types?
//                 in order to promote portability - there is thus no need to rewrite code to fit
//                   specific platform
//    2. What is Java’s character type, and how does it differ from the character type used by
//    some other programming languages?
//                   They are not 8 bit quantitties - Java uses Unicode. 
//    3. A boolean value can have any value you like because any nonzero
//    value is true.
//    True or False?
//                    True
//    4. Given this output,
//            ONE
//            TWO
//            THREE
//    using a single string, show the println( ) statement that produced it.
//                    System.out.println("ONE \n TWO \n THREE")
//    5. What is wrong with this fragment?
//            for (i = 0; i < 10; i++) {
//                int sum;
//                sum = sum + i;
//            }
//            System.out.println(Sum is:  + sum);
//                  Sum is declared but not initialized.
//    6. Explain the difference between the prefix and postfix forms of the increment
//    operator.
//                    Prefix is when you add before you read the instruction
//                    Postfix is to increment after done instruction
//    7. Show how a shortcircuit AND can be used to prevent a dividebyzero
////    error.
//                        int a = 10;
//                        int b = 5;
//                        if ( b != 0 && a % b  ) {
//                            System.out.println("a is a factor of a");}
//    8. In an expression, what type are byte and short promoted to?
//                        int
//    9. In general, when is a cast needed?
//                        when you need to convert one type to another
//    10. Write a program that finds all of the prime numbers between 2 and 100.
      public static void main(String[] args) {
        int i;
        int maxNumber = 100;
        int number = 0;
        boolean isPrime = true;
        
        // loop through numbers
        for (i = 2; i <= maxNumber; i++){
            isPrime = CheckPrime(i);
            if (isPrime){
                System.out.println(i + " is a prime number");
            }
        }}
             public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
       }

    
//    11. Does the use of redundant parentheses affect program performance?
//             No
//    12. Does a block define a scope?
//             Yes
}
