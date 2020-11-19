/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author Chrissie
 */
public class Test_SelfTest {

    public static void main(String[] args) {

        System.out.println("\n\n");
        System.out.println("Question 1:\n\n");

//        1. Given this fragment, is the following fragment correct?
        System.out.println("\nNo, it isn't. The count avariable is set to "
                + "private, you will need a getter to access it from a "
                + "different class.\n");

        System.out.println("Question 2:\n\n");

//        2. An access modifier must __________ a member’s declaration.
        System.out.println("\n \"begin\"  \n");

        System.out.println("Question 3:\n\n");

//        3. The complement of a queue is a stack. It uses firstin, lastout 
//          accessing and is often likened to a stack of plates. The first 
//          plate put on the table is the last plate used. 
//          - Create a stack class called Stack that can hold characters. 
//          - Call the methods that access the stack push( ) and pop( ). 
//          - Allow the user to specify the size of the stack when it is created. 
//          - Keep all other members of the Stack class private. 
//          (Hint: You can use the Queue class as a model; just change the way 
//          the data is accessed.)
        System.out.println("\n");

        Stack bigQ = new Stack(100);
        Stack smallQ = new Stack(4);
        char ch;
        int i;

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
        System.out.println("\n");

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

        System.out.println("\n");
        System.out.println("Question 4:\n\n");

//        4. Given this class,  write a method called swap( ) that exchanges the 
//          contents of the objects referred to by two Test object references.
        System.out.println("\n I = a, it would be the same value, a method would be pointless");
        System.out.println("\n");

        System.out.println("Question 5:\n\n");
//        5. Is the following fragment correct?
        System.out.println("\nNo, you have a method that returns a string, but "
                + "only takes integers as parameters.\n");

        System.out.println("Question 6:\n\n");

//        6. Write a recursive method that displays the contents of a string backwards.
        backwards("abcdef");

        System.out.println("\n");
        System.out.println("Question 7:\n\n");

//        7. If all objects of a class need to share the same variable, how must 
//          you declare that variable?
        System.out.println("\nAdd the word static to that variable \n");

        System.out.println("Question 8:\n\n");

//        8. Why might you need to use a static block?
        System.out.println("\nWhen a class needs some type of initiaizations "
                + "before it is ready to create objects - the block is executed when the class is first loaded\n");
        System.out.println("Question 9:\n\n");

//        9. What is an inner class?
        System.out.println("\nIt is a nested class. It is a class within a "
                + "class that can only be accessed by the outer class.\n");

        System.out.println("Question 10:\n\n");

//        10. To make a member accessible by only other members of its class, 
//          what access modifier must be used?
        System.out.println("\n private \n");

        System.out.println("Question 11:\n\n");

//        11. The name of a method plus its parameter list constitutes the method’s
//        _______________.
        System.out.println("\nSignature \n");
        System.out.println("Question 12:\n\n");

//        12. An int argument is passed to a method by using callby_______________.
        System.out.println("\nvalue\n");
        System.out.println("Question 13:\n\n");

//        13. Create a varargs method called sum( ) that sums the int values 
//          passed to it. Have it return the result. Demonstrate its use.
        System.out.println("\n");

        sum(1, 10, 100, 1000); //see code below

        System.out.println("\n");
        System.out.println("Question 14:\n\n");

//        14. Can a varargs method be overloaded?
        System.out.println("\nYes it can be, but beware of ambiguity\n");
        System.out.println("Question 15:\n\n");

//        15. Show an example of an overloaded varargs method that is ambiguous.
                /* 

            static int ambuiguity(int ... v){
            return sum(v);
            }

            static int ambuiguity(int a, int ... v){
            return sum(v);
            }
                 */

    }

    /// Other methods used in answers
    static void backwards(String letters) {

        if (letters.length() < 2) {
            System.out.println(letters);
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = letters.length() - 1; i >= 0; i--) {
                char c = letters.charAt(i);
                result.append(c);
            }
            System.out.println("New string: " + result);
        }
    }

    //13. Create a varargs method called sum( ) that sums the int values 
//        passed to it. Have it return the result. Demonstrate its use.
    static int sum(int... v) {

        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg " + v[i]);
            sum += v[i];

        }
        System.out.println("\nSum is: " + sum);
        return sum;

    }

}
