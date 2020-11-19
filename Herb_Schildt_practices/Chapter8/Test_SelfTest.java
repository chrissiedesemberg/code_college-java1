/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import Chapter8.qpack.DynQueue;
import Chapter8.qpack.FixedQueue;
import Chapter8.qpack.CircularQueue;
import Chapter8.qpack.TT8_1_ICharQ;

/**
 *
 * @author Chrissie
 */
public class Test_SelfTest {
    
    public static void main(String[] args) {
        
        System.out.println("\n\n");
        System.out.println("Question 1: \n");
//        1. Using the code from Try This 8­1, put the ICharQ interface and its 
//          three implementations into a package called qpack. Keeping the queue 
//          demonstration class IQDemo in the default package, show how to import 
//          and use the classes in qpack.

        
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        TT8_1_ICharQ iQ;

        char ch;
        int i;
        iQ = q1;

        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.println("Contents of fixed queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");

        iQ = q2;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));

            System.out.println("Contents of dynamic queue: ");
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println("");

            iQ = q3;
            for (i = 0; i < 10; i++) {
                iQ.put((char) ('A' + i));
            }
            System.out.println("Contents of circular queue: ");
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
            System.out.println("");

            for (i = 10; i < 20; i++) {
                iQ.put((char) ('A' + i));
            }

            System.out.println("Contents of Circular queue: ");
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println("\n Store and consume from circular queue.");
            for (i = 0; i < 20; i++) {
                iQ.put((char) ('A' + i));
                ch = iQ.get();
                System.out.print(ch);
            }
        }
        System.out.println("\n\n");
        System.out.println("Question 2: \n");
        
//        2. What is a namespace? Why is it important that Java allows you to 
//              partition the namespace?

        System.out.println("\n namespace is a a way to keep one set of names separate from another. "
                + "The class names declared in one namespace does not conflict "
                + "with the same class names declared in another\n");
        System.out.println("Question 3: \n");
        
//        3. Typically, packages are stored in ______________.

        System.out.println("\ndirectories\n");
        System.out.println("Question : \n");
       
//        4. Explain the difference between protected and default access.

        System.out.println("\nProtected: is a file accessible within its package\n "
                + " Default: when no package statement was specified, you will have "
                + "public access within that package and not visible outside of package\n");
        System.out.println("Question 5: \n");
       
//        5. Explain the two ways that the members of a package can be used by 
//          other packages. 

        System.out.println("\n1) By importinging it.\n"
                + "2) By using its full name to access (including the package name)\n");

        System.out.println("Question : 6\n");
        
//          6. “One interface, multiple methods” is a key tenet of Java. What 
//          feature best exemplifies it?

        System.out.println("\n\n");
        System.out.println("Question 7: \n");
       
//        7. How many classes can implement an interface? How many interfaces can 
//          a class implement?

        System.out.println("\na) all classes can implement one interface at a time."
                + "b) A class can only implement one interface at a time\n");
        System.out.println("Question 8: \n");
       
//        8. Can interfaces be extended?

        System.out.println("\nYes, it can.\n");
        System.out.println("Question 9: \n");
       
//        9. Create an interface for the Vehicle class from Chapter 7. Call the 
//          interface IVehicle.

        System.out.println("\nDone\n");
        System.out.println("Question 10: \n");
       
//        10. Variables declared in an interface are implicitly static and final. 
//          Can they be shared with other parts of a program?

        System.out.println("\nThey can be shared, but not changed.\n");
        System.out.println("Question 11: \n");
       
//        11. A package is, in essence, a container for classes. True or False?

        System.out.println("\nTrue\n");
        System.out.println("Question 12: \n");
       
//        12. What standard Java package is automatically imported into a program? 

        System.out.println("\n java.lang\n");
        System.out.println("Question 13: \n");
       
//          13. What keyword is used to declare a default interface method?

        System.out.println("\ndefault\n");
        System.out.println("Question 14: \n");
       
//        14. Beginning with JDK 8, is it possible to define a static method in 
//          an interface?

        System.out.println("\nYes.\n");
        System.out.println("Question 15: \n");
       
//             15. Assume that the ICharQ interface shown in Try This 8­1 has been 
//              in widespread use for several years. Now, you want to add a method 
//              to it called reset( ), which will be used to reset the queue to 
//              its empty, starting condition. Assuming JDK 8 or later, how can 
//              this be accomplished without breaking preexisting code?

        System.out.println("\nBy adding another method to the interface. You would"
                + "then change the \n");
        System.out.println("Question 16: \n");
       
//        16. How is a static method in an interface called? 
        System.out.println("\npackagename.staticmethodname;\n");
        System.out.println("Question 16: \n");
//          17. Can an interface have a private method?
            System.out.println("\nyes, with the current Java.\n");
    }
    
}
