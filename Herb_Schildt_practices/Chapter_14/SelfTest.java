package Chapter_14;

public class SelfTest {

    //6

    interface myTest{
        boolean testing(int n);

    }

    //7

    interface NumericFunc {
        int func(int n);
    }


    interface MyFunc<T> {
        T methodfunc(T t);
    }

    // 9
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);


    }
    public static void main(String[] args) {


//    1. What is the lambda operator?
            // --> It is an anonymous method that results in a form of an anonymous class.
                    //->
    //              parameters -> actions
//    2. What is a functional interface?
            // --> an interface that contains one and only one abstract method.
//    3. How do functional interfaces and lambda expressions relate?
            // -->
//    4. What are the two general types of lambda expressions?
            // -->
//    5. Show a lambda expression that returns true if a number is between 10 and 20,
//    inclusive.
            myTest value = (n) -> ( n > 9 && n < 21 );
        System.out.println("Is number between 10 and 20 inclusive: " + value.testing(10));
//    6. Create a functional interface that can support the lambda expression you created in
//    question 5. Call the interface MyTest and its abstract method testing().
             /*
             interface myTest{
                boolean testing(int n);

    }*/
//    7. Create a block lambda that computes the factorial of an integer value.
//    Demonstrate its use. Use NumericFunc, shown in this chapter, for the functional interface.
            NumericFunc factor = (n) -> {
                int result = 1;
                n = n < 0 ? -n : n;
                for (int i = n; i >= 1; i--)
                        result *= i;
                return result;
            };
        System.out.println("Factorial is of 12 is: " + factor.func(12));
        System.out.println("Factorial is of 11 is: " + factor.func(11));
        System.out.println("Factorial is of 3 is: " + factor.func(3));

//    8. Create a generic functional interface called MyFunc<T>.
//    Call its abstract methodfunc().
//    Have func() return a reference of type T.
//    Have it take a parameter of type T.
//    (Thus, MyFunc will be a generic version of NumericFunc shown in the chapter.)
//    Demonstrate its use by rewriting your answer to question 7 so it uses MyFunc<T>
//    rather than NumericFunc.

        MyFunc<Integer> factor2 = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;
            for (int i = n; i >= 1; i--)
                result *= i;
            return result;
        };
        System.out.println("\nGeneric Type -- Factorial is of 12 is: " + factor2.methodfunc(12));
        System.out.println("Generic Type -- Factorial is of 11 is: " + factor2.methodfunc(11));
        System.out.println("Generic Type -- Factorial is of 3 is: " + factor2.methodfunc(3));

//    9. Using the program shown in Try This 141, create a lambda expression that removes
//    all spaces from a string and returns the result. Demonstrate this method by passing
//    it to changeStr().
        System.out.println("-----------\n");
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("\nHere is input string: " + inStr);

        StringFunc noSpace = (str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            } return result;
        };

        outStr = changeStr(noSpace, inStr);
        System.out.println("\nRemoved spaces : " + outStr);
        System.out.println();


//    10. Can a lambda expression use a local variable? If so, what constraint must be met?
        // Yes , it has to be final
//    11. If a lambda expression throws a checked exception, the abstract method in the
//    functional interface must have a throws clause that includes that exception. True or False?
        //  True
//    12. What is a method reference?
        //A method reference provides a way to refer to a method without executing it.

//    13. When evaluated, a method reference creates an instance of the -->functional interface--> supplied by its target context.
//    14. Given a class called MyClass that contains a static method called
//    myStaticMethod(), show how to specify a method reference to myStaticMethod().
            // --> MyClass::MyStaticMethod
//    15. Given a class called MyClass that contains an instance method called
//    myInstMethod() and assuming an object of MyClass called mcObj, show how to
//    create a method reference to myInstMethod() on mcObj.
       // mcObj::myInstMethod
//    16. To the MethodRefDemo2 program, add a new method to MyIntNum called
//    hasCommonFactor(). Have it return true if its int argument and the value stored in
//    the invoking MyIntNum object have at least one factor in common. For example, 9 and 12 have a common factor, which is 3, but 9 and 16 have no common factor.
//    Demonstrate hasCommonFactor() via a method reference.
//    17. How is a constructor reference specified?
       // classname::new

        /* in example :
            myFunc myClassCons = MyClass::new;

         */
//    18. Java defines several predefined functional interfaces in what package?
        // java.util.function
}
}