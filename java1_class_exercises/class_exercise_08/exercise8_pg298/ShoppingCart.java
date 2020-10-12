
package exercise8_pg298;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        
        item1.setItemFields("Shirt", 2, 15);
        item1.displayItem();
        //void type not allowed here

        // Call the 4-arg setItemFields method, checking the return value.  
        
        int returningNum = item1.setItemFields("Pants", 5, 20, 'C');
        if (returningNum < 0) {
            System.out.println("No color code - item not added.");
        } else {
            item1.displayItem();
        }

	// Test your code for both valid and invalid values
        
        
        
    }
}
