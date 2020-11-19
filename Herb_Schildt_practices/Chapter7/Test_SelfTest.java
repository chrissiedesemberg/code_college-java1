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
public class Test_SelfTest {
    
    public static void main(String[] args) {
        
            System.out.println("\n\n");
            System.out.println("Question: 1\n");
        
//        1. Does a superclass have access to the members of a subclass? Does a subclass have
//        access to the members of a superclass?
        
            System.out.println("\nThe subclass has access to the members in the superclass, but the "
                    + "superclass does not have access to the members in the subclass\n");
       
            System.out.println("Question: 2\n");
      
//        2. Create a subclass of TwoDShape called Circle. Include an area( ) method that
//        computes the area of the circle and a constructor that uses super to initialize the
//        TwoDShape portion.
        
            System.out.println("\n");
            
            class Circle extends TwoDShape {
            
 
                double area;
                
                
                Circle(double x) {
                super(x);
                }
                
                double width = getWidth();
                double radius = width / 2;

                double area() {
                return Math.PI * (radius * radius);
                }
                
            }
            
            Circle firstCircle = new Circle(12.0);
            
            System.out.println("The area of the circle is: " + firstCircle.area());
            
            
            
            System.out.println("\n");
            System.out.println("Question: 3\n");
      
//        3. How do you prevent a subclass from having access to a member of a superclass?
        
            System.out.println("\n By preceding the declarations with the word \"final\"\n");
            System.out.println("Question: 4\n");
      
//        4. Describe the purpose and use of the two versions of super described in this chapter.
        
            System.out.println("\nCalling the super() class' constructor through the subclass... super(parameter-list); \n"
                    + "Calling the member of a super class like the keyword \"this\" super.member\n");
            System.out.println("Question: 5\n");
      
//        5. Given the following hierarchy:
//        In what order do the constructors for these classes complete their execution when a
//        Gamma object is instantiated?
        
            System.out.println("\nAplha, Beta and then Gamma\n");
            System.out.println("Question: 6\n");
      
//        6. A superclass reference can refer to a subclass object. Explain why this is important as
//        it relates to method overriding.
        
            System.out.println("\nSometimes you need to display more or less information that uses the same call,"
                    + "method overriding allows you to override the super class's method.\n");
            System.out.println("Question: 7\n");
      
//        7. What is an abstract class?
        
            System.out.println("\nAn abstract\n" +
"method contains no body and is, therefore, not implemented by the superclass. Thus, a\n" +
"subclass must override it\n");
            System.out.println("Question: 8\n");
      
//        8. How do you prevent a method from being overridden? How do you prevent a class
//        from being inherited?
        
            System.out.println("\nYou use the word \"final\" as the modifier\n");
            System.out.println("Question: 9\n");
      
//        9. Explain how inheritance, method overriding, and abstract classes are used to
//        support polymorphism.
        
            System.out.println("\n polymorphism allows a\n" +
"general class to specify methods that will be common to all of its derivatives, while\n" +
"allowing subclasses to define the specific implementation of some or all of those\n" +
"methods\n");
            System.out.println("Question: 10\n");
      
//        10. What class is a superclass of every other class?
        
            System.out.println("\nThe Object Class\n");
            System.out.println("Question: 11\n");
      
//        11. A class that contains at least one abstract method must, itself, be declared abstract.
//        True or False?
        
            System.out.println("\nTrue\n");
            System.out.println("Question: 12\n");
      
//        12. What keyword is used to create a named constant?
        
            System.out.println("\nfinal \n");
            System.out.println("Question: 13\n");
      
//        13. Assume that class B inherits class A. Further, assume a method called makeObj( )
//        that is declared as shown here:
//        Notice that makeObj( ) returns a reference to an object of either type A or B,
//        depending on the value of which. Notice, however, that the return type of makeObj( )
//        is A. (Recall that a superclass reference can refer to a subclass object.) Given this
//        situation and assuming that you are using JDK 10 or later, what is the type of myRef in
//        the following declaration and why?
        
            System.out.println("\nType A\n");
            System.out.println("Question: 14\n");
      
//        14. Assuming the situation described in Question 13, what will the type of myRef be
//        given this statement?
        
            System.out.println("\nType B - it is cast to B\n");

      
//        
     
        
    }
    
}
