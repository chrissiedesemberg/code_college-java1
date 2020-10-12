
package exercise11;

public class exercise11_2 {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  

        	// Print an error message if fewer than 2 args are passed in.
                
        if (args.length <= 1) {
        System.out.println("Error - not enough info supplied");
        }
        else {
        System.out.println("Name is: "+(args[0]));
        System.out.println("Age is: "+(args[1]));
        System.out.println("The client's name is: " + args[0] + " and she is "+ args[1] + " years old.");
        }
    }
}
