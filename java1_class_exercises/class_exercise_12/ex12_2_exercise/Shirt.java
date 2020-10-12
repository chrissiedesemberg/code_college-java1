package exercise_12.ex12_2_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;}
    
    // Override display() in the superclass to also show size and colorCode.
    public void display(){
        super.display();
        System.out.println("ColorCode: " + colorCode);
        System.out.println("Size: " + size);
    }
    //   Avoid duplicating code.
}
