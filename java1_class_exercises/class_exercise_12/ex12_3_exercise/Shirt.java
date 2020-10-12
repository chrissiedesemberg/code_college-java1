package exercise_12.ex12_3_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
    public char getColor(){
        return colorCode;
    }
    
    public String getColorName(){
        String color = "";
    switch(colorCode) {
        case 'R':
            color = "Red";
            break;
        case 'B':
            color = "Blue";
            break;
        case 'G':
            color = "Green";
            break;            
        default:
            color = "Unknown";
    }
        return color;
    };
    
       // Use a switch statement.  Return the color name. 
    
    

}
