/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;
import java.text.DecimalFormat;

/**
 *
 * @author Chrissie
 */
public class TEST_SelfTest {
    public static void main(String[] args) {
       //1. What is bytecode and why is it important to Java’s use for Internet programming?
                //Bytecode is a highly optimized set of instructions designed 
                //to be executed by the Java Virtual Machine (JVM)
       //2. What are the three main principles of objectoriented programming?
                //Encapsulation
                //Polymorphism
                //inheritance
       //3. Where do Java programs begin execution?
                //Where the program calls main()
       //4. What is a variable?
                //a variable is the name where you attach a value to a name
       //5. Which of the following variable names is invalid?
            //A. count    //B. $count  //C. count27   //D. 67count
                // D
       //6. How do you create a singleline comment? How do you create a multiline comment?
                // Single line comment                  /* Miltiline comment */
       //7. Show the general form of the if statement. Show the general form of the for loop.
                // if ( condition ){
                    //code
                    //}
                
                // for (i = 0; i < 10; i++){
                    //code
                    //}                    
       //8. How do you create a block of code?
                // using curly braces {}
       //9. The moon’s gravity is about 17 percent that of earth’s. Write a program that computes 
            //your effective weight on the moon.
            
            double myWeightOnEarth = 72.4;
            double myWeightOnMoon = myWeightOnEarth * 0.17;

            System.out.println("My weight on earth is: " + myWeightOnEarth + 
                    "kg. On the moon, my weight would be: " + Math.round(myWeightOnMoon) + "kg.");
            System.out.println("");  
            System.out.println(""); 
            System.out.println(""); 
            System.out.println("Question 10:"); 
       //10. Adapt Try This 1-2 so that it prints a conversion table of inches to meters. 
            //Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches. 
            //(One meter approximately 39.37 inches.)
            double inches, meters;
            int counter;

            meters = 0;
            String word = "meter ";

            for (counter = 1; counter < 101; counter++){
                meters++;
                inches = meters * 39.37;
                if (counter % 10 == 0) {
                    System.out.println("");
                }
                else {
                    if (meters > 1){
                    word = "meters";
                    }
                }
                System.out.println(counter + " | " + meters + " " + word + " | "+ inches + " inches.");
        }
       //11. If you make a typing mistake when entering your program, what sort of error will result?
                //Syntax error
       //12. Does it matter where on a line you put a statement?
                // No it doesnt
        
        
    }
}
