/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

public class ShoppingCart {
    public static void main (String[] args){
        
        
        /// Exercise 7_1
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("********** Exercise 7_1 **********");
        
        String custName = "Steve Smith";
        String firstName;
        String lastName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        int indexNumber = custName.indexOf(" ");
        System.out.println("Index of space: " + indexNumber);

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, 6);
        System.out.println("First name of customer: " + firstName);
        
        // Use the substring method parse out the lastName name and print it.
        lastName = custName.substring(6);
        System.out.println("Lastname name of customer: " + lastName);
       
        
        
        /// Exercise 7_2        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("********** Exercise 7_2 **********");
        
        //Instantiate and initialize sb to firstName.
          StringBuilder sb = new StringBuilder(firstName);
	// Put the full name back together, using StringBuilder append method.
          sb.append(lastName);           
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        System.out.println("StringBuilder used to rebuild name: " + sb);
        
        
        
        /// Exercise 7_3
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("********** Exercise 7_3 **********");
        
          int int1;
        
	//  Declare and initialize variables of type long, float, and char.
            long longNumber = 1234567654L;
            float floatNumber = 0.14F;
            char charActer = 'B';
        
        // Print the long variable.
            System.out.println("longNumber: " + longNumber);
            System.out.println("floatNumber: " + floatNumber);
            System.out.println("charActer: " + charActer);
	// Assign the long to the int and print the int variable.
            int1 = (int) longNumber;
            System.out.println("Converted longNumber to Int: " + int1);
        
    }
}

