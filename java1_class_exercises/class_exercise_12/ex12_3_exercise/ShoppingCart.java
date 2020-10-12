package exercise_12.ex12_3_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item newItem = new Shirt(10.00, 'L', 'R');
        
        // call the display method on the object, then the getColor method
        newItem.display();
        if (newItem instanceof Shirt) {
            String color = ((Shirt) newItem).getColorName();
            System.out.println("Color: " + color);
        }
        else System.out.println("Item is not a shirt");}
}
