/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author Chrissie
 */
public class Test_SelfTest {
   
    public static void main(String[] args) {
        
        System.out.println("\n\n");
        System.out.println("Question 1: \n");
        
//        1. What class is at the top of the exception hierarchy?
        
        System.out.println("\nThrowable: Exception and Error\n");
        System.out.println("Question 2: \n");
                                                                  
//        2. Briefly explain how to use try and catch.
        
        System.out.println("\nYou place the code that yould like to run in the \" try \""
                + "code block and then below it you add the \"catch \" code block"
                + "to catch the errors:\n try {code to run \n} "
                + "catch (errorName error-nickname) {\n code block - message etc}\n");
        System.out.println("Question 3: \n");
        
//        3. What is wrong with this fragment?
        
        System.out.println("\nIt has no try code block\n");
        System.out.println("Question 4: \n");
        
//        4. What happens if an exception is not caught? 
        
        System.out.println("\nThen the try block will end normally. The catch block "
                + "will only kick in if an error is caught. If not then the normal"
                    + " java error message would display -which is not best practice\n");
        System.out.println("Question 5: \n");
        
//        5. What is wrong with this fragment?
        
        System.out.println("\nA super class is before a subclass - the code will not be reached\n");
        System.out.println("Question 6: \n");
        
//        6. Can an inner catch rethrow an exception to an outer catch?
        
        System.out.println("\nYes, an exception can be rethrown\n");
        System.out.println("Question 7: \n");
        
//        7. The finally block is the last bit of code executed before your program ends. True or
//        False? Explain your answer.
        
        System.out.println("\nTrue, the finally block is there to execute no "
                + "matter what happened in the try and catch block.\n");
        System.out.println("Question 8: \n");
        
//        8. What type of exceptions must be explicitly declared in a throws 
//          clause of a method? 
        
        System.out.println("\njava.io.IOExceptions\n");
        System.out.println("Question 9: \n");
        
//        9. What is wrong with this fragment?
        
        System.out.println("\nMyClass does not extend Throwable\n");
        System.out.println("Question 10: \n");
        
//        10. In question 3 of the Chapter 6 Self Test, you created a Stack class. 
//          Add custom exceptions to your class that report stack full and stack 
//          empty conditions.
        
System.out.println("\n");

        Stack bigQ = new Stack(100);
        Stack smallQ = new Stack(4);
        char ch;
        int i;

        try{
        System.out.println("Using bigQ to store the aplhabet.");
        for (i = 0; i < 26; i++) {
            bigQ.push((char) ('A' + i));
        }
        System.out.println("Print elements of bigQ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.pop();
            if (ch != (char) 0) {
                System.out.print(ch + " ");
            }
        }
        System.out.println("\n");}
        catch (QueueFullException | QueueEmptyException qfex){
            System.out.println("Exception: " + qfex);
        }

        try {
        System.out.println("Using smallQ to print out errors.");
        for (i = 0; i < 5; i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));
            smallQ.push((char) ('Z' - i));
        }
        System.out.println("");

        System.out.print("Contents of smallQ: \n");
        for (i = 0; i < 5; i++) {
            ch = smallQ.pop();

            if (ch != (char) 0) {
                System.out.println(ch);
            }
        }
        }
        catch (QueueFullException | QueueEmptyException qfex){
        System.out.println("Exception: " + qfex);
        }
       
        

        System.out.println("\n");        
        
        System.out.println("Question 11: \n");
        
//        11. What are the three ways that an exception can be generated?   
        
        System.out.println("\nDirectly by JVM, in the catch block or in a throw statmeent \n");
        System.out.println("Question 12: \n");
        
//        12. What are the two direct subclasses of Throwable?
        
        System.out.println("\nException and error\n");
        System.out.println("Question 13: \n");
        
//        13. What is the multi­catch feature?
        
        System.out.println("\nIt is the ability to list more than one catch clause to one "
                + "catch code block using the "+"\"|\" sign.\n");
        System.out.println("Question 14: \n");
        
//        14. Should your code typically catch exceptions of type Error?
        
        System.out.println("\nNo\n");
   
        
           
        
    }
    
}
