/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author Chrissie
 */
public class Test_SelfTest {
    
    public static void main(String[] args) {
        
//        1. What is the difference between a class and an object?
                System.out.println("\n\nQuestion 1: ");
                System.out.println("\n\n An object is an instance of a class. "
                        + "\nA class is a template that defines the form of an "
                        + "object.\n\n");

//        2. How is a class defined?
                System.out.println("\n\nQuestion 2: ");
                System.out.println("\n\n By using the word class in it, like "
                        + "this:\n class classname {\n //declare variables \n"
                        + "//declare methods }\n}\n\n\n");

//        3. What does each object have its own copy of?
                System.out.println("\n\nQuestion 3: ");
                System.out.println("\n\n of the instance variables in its class\n\n");


//        4. Using two separate statements, show how to declare an object called counter of a
//        class called MyCounter.
                System.out.println("\n\nQuestion 4: ");
                System.out.println("\n\n Counter myCounter;"
                        + "myCounter = new Counter(); \n\n");


//        5. Show how a method called myMeth( ) is declared if it has a return type of double
//        and has two int parameters called a and b.
                System.out.println("\n\nQuestion 5: ");
                System.out.println("\n\n myMeth(int a, int b){"
                        + "return (double) a + b } \n\n");


//        6. How must a method return if it returns a value?
                System.out.println("\n\nQuestion 6: ");
                System.out.println("\n\n Must be a non-void return type "
                        + " and it must have the word return in the statement "
                        + "- to return a value\n\n");

//        7. What name does a constructor have?
                System.out.println("\n\nQuestion 7: ");
                System.out.println("\n\n The same name as the class \n\n");


//        8. What does new do?
                System.out.println("\n\nQuestion 8: ");
                System.out.println("\n\n It returns a reference to the newly created object\n\n");


//        9. What is garbage collection, and how does it work?
                System.out.println("\n\nQuestion 9: ");
                System.out.println("\n\n When no references of an object exists, "
                        + "then Java will assume that the object is no longer "
                        + "needed and will release the memory that is occupaied "
                        + "by that object.\n\n");


//        10. What is this?
                System.out.println("\n\nQuestion 10: ");
                System.out.println("\n\n When a method is called, it is "
                        + "automatically passed an implicit argument that is a "
                        + "reference to the invoking object (that is, the object "
                        + "on which the method is called). This reference is "
                        + "called 'this'.\n\n");


//        11. Can a constructor have one or more parameters?
                System.out.println("\n\nQuestion 11: ");
                System.out.println("\n\n Yes, it can. \n\n");


//        12. If a method returns no value, what must its return type be?
                System.out.println("\n\nQuestion 12: ");
                System.out.println("\n\n It must be a void return type\n\n");


        
        
        
        
        
        
    }
    
}
