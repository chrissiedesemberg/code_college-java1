package Chapter_13;

import Chapter9.QueueEmptyException;
import Chapter9.QueueFullException;
import Chapter9.Stack;

public class SelfTest {
    public static void main(String[] args) {


//    1. Generics are important to Java because they enable the creation of code that is
//    A. Typesafe
//    B. Reusable
//    C. Reliable
//    D. All of the above
                        // --> D
//    2. Can a primitive type be used as a type argument?
                        // --> no you cannot
//        3. Show how to declare a class called FlightSched that takes two generic parameters.
                        // --> class FlightSched<T, V> {//...}
//        4. Beginning with your answer to question 3, change FlightSched’s second type parameter
//        so that it must extend Thread.
//                      -->  class FlightSched<T, V implements Thread> {//...}
//    5. Now, change FlightSched so that its second type parameter must be a subclass of its
//    first type parameter.
            //          --> class FlightSched<T, V extends T> {//...}
//    6. As it relates to generics, what is the ? and what does it do?
        //              -->It is a wildcard and it represents and unknown type and uses  the absolute
                    //  values

//        7. Can the wildcard argument be bounded?
            ///        --> yes
//        8. A generic method called MyGen( ) has one type parameter. Furthermore, MyGen() has
//        one parameter whose type is that of the type parameter. It also returns an object of that
//        type parameter. Show how to declare MyGen( ).
                //     --> <T> T MyGen(T o) {}

//            9. Given this generic interface show the declaration of a class called MyClass that
//            implements IGenIF.
                    // interface IGenIF<T, V extends T> {//...}
                    // -->   class myClass<T, V extends T> implements IGenIF<T, V> { //... }

//            10. Given a generic class called Counter<T>, show how to create an object of its raw
//            type.
                    //--> Counter x = new Counter();

//    11. Do type parameters exist at run time?
                    // --> No

//            12. Convert your solution to question 10 of the Self Test for Chapter 9 so that it is
//            generic. In the process, create a stack interface called IGenStack that generically
//            defines the operations push( ) and pop( ).

        System.out.println("\n");
//            13. What is < >?
                        // --> It is called the diamond operator
//            14. How can the following be simplified?
                // MyClass<Double, String> obj = new MyClass<Double, String>(1.1, "Hi");
                    // var obj = MyClass<Double, String>(1.1, "Hi");


}}
