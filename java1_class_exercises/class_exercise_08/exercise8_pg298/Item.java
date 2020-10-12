
package exercise8_pg298;


public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemFields(String desc, int quantity, double price) {
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    
        public int setItemFields(String desc, int quantity, double price, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, quantity, price);
            return 1;
        }
        else return -1;
        
    }

    
}
