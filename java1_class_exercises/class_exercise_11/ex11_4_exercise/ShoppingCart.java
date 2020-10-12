package exercise_11.ex11_4_exercise;
import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList <String> dogTypes = new ArrayList();
            System.out.println("No dogs added: " + dogTypes);
            dogTypes.add("Boston Terrier");
            dogTypes.add("Jack Russel");
            dogTypes.add("Labrador");
            System.out.println("BT, JR, Lab added: " + dogTypes);
        // add (insert) another element at a specific index
            dogTypes.add(1, "Boxer");
            System.out.println("Boxer added at index 1: " + dogTypes);
            System.out.println("New dogs list: " + dogTypes);
	// Check for the existence of a specific String element.
            System.out.println("Find index of \"Jack Russel\": " + (dogTypes.indexOf("Jack Russel")));
            System.out.println("contains \"Jack Russel\":  " + (dogTypes.contains("Jack Russel")));
        //   If it exists, remove it.
            dogTypes.remove(2);
            System.out.println("Removed Jack Russell: " + dogTypes);
    }
}
