/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author Chrissie
 */
public class TEST_SelfTest {
    
    public static void main(String[] args) throws java.io.IOException{
        
    
//    1. Write a program that reads characters from the keyboard until a period is received.
//    Have the program count the number of spaces. Report the total at the end of the
//    program.
    
        System.out.println("\n\nQuestion 1:");
    
        char character, ignore;
        
    
        for (;;) {
            do { 
                System.out.println("Type a character and select ':' to exit:");
                
                character = (char) System.in.read();
                do {
                ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while(ignore != '\n'); 
          
            if(character == ':') {
                System.out.println("\n You have choses ':'... quiter");
                break;
            }
                   
        }
    
//    2. Show the general form of the ifelseif ladder.
        

        System.out.println("\n\nQuestion 2:");
        System.out.println("\nif (condition ) {\nstatement\n}\nelse if"
                + "\n(condition {\nstatement\n}\nelse if (condition) "
                + "{\nstatement\n}\nelse\nstatement\n}\n\n");

//    3. Given .... to what if does the last else associate?
        System.out.println("\n\nQuestion 3:");
        System.out.println("The the main if --> if( x< 10)\n\n");

//    4. Show the for statement for a loop that counts from 1000 to 0 by –2.

        System.out.println("\n\nQuestion 4:");
        for (int i = 1000; i > 0; i-=2) 
              System.out.print(i + " \n\n");


//    5. Is the following fragment valid?
        System.out.println("\n\nQuestion 5:");
        System.out.println("Yes - it is\n\n");

//    6. Explain what break does. Be sure to explain both of its forms.

        System.out.println("\n\nQuestion 6:");
                System.out.println("Break is used to exit a loop or to use as a goto."
                        + "\n A goto by using \"break label\". Thus you can use a "
                        + "labeled break statement to\n exit from a set of nested blocks\n\n" );
//    7. In the following fragment, after the break statement executes, what is displayed?

        System.out.println("\n\nQuestion 7:"); 
            System.out.println("\"after while\" and then \"After for\"\n\n");

//    8. What does the following fragment print?

        System.out.println("\n\nQuestion 8:");
            System.out.println("It will just print \" 1 2 3 4 5 6 7 8 9\"\n\n");
            
//    9. The iteration expression in a for loop need not always alter the loop control variable
//    by a fixed amount. Instead, the loop control variable can change in any arbitrary way.
//    Using this concept, write a program that uses a for loop to generate and display the
//    progression 1, 2, 4, 8, 16, 32, and so on.

       System.out.println("\n\nQuestion 9:");
       
       for (int i = 1; i < 1000; i+=i) {
          System.out.print(i + " \n\n");
       }

//    10. The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to
//    convert a lowercase letter to uppercase, subtract 32 from it. Use this information to
//    write a program that reads characters from the keyboard. Have it convert all lowercase
//    letters to uppercase, and all uppercase letters to lowercase, displaying the result. Make
//    no changes to any other character. Have the program stop when the user enters a
//    period. At the end, have the program display the number of case changes that have
//    taken place.

        System.out.println("\n\nQuestion 10:\n\n");
        char letter, skip;
        int convertedLetter;
        
        for (;;) {
            
            do {
                System.out.println("\n\nChoose a letter to swap cases (press 'q' to exit): ");
                letter = (char) System.in.read();

                    
                    if(Character.isUpperCase(letter)){
                        convertedLetter = ((int) letter) + 32;
                        letter = (char) convertedLetter;
                        System.out.println("Letter converted to Lowercase: " + letter);
                    }
                    else if(Character.isLowerCase(letter)){
                       convertedLetter = ((int) letter) - 32;
                        letter = (char) convertedLetter;
                        System.out.println("Letter converted to Uppercase: " + letter);
                    }
                    skip = (char) System.in.read(); 
                    
            } while (skip == '\n' &&  letter != 'q');
            if(letter == 'q') break;
            
        }
        

//    11. What is an infinite loop?
                System.out.println("\n\nQuestion 11:");
                System.out.println("An infinite loop is a loop that has no "
                     + "condition to be met or a condition that cannot be met.\n\n");
//    12. When using break with a label, must the label be on a block that contains the
//    break?
                System.out.println("\n\nQuestion 12:");
                System.out.println(" Yes, it must\n\n");
                
        }
    }
