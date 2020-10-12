
package exercise_11.ex11_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
       
	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
             System.out.println("Only one argument passed, you need 2");
        } else {
         System.out.println("Args[0] : " + args[0]);
        System.out.println("Args[1] : " + args[1]);}
    }}

