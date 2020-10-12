package exercise12;

public class Item {
    private int id;
    private String desc;
    private double price;
    private char colorCode;
    static int nextId = 1;
    
    public Item(){
    // set default values
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    public Item(String desc, double price, char colorCode) {
        setId();
        setDesc(desc);
        setPrice(price);
        setcolorCode(colorCode);
    }

    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
        System.out.println("\tColor Code: "+getcolorCode());
    }

    private void setId() {
        id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }
    
     private void setcolorCode(char colorCode) {
        this.colorCode = colorCode;
    }

     public char getcolorCode() {
        return colorCode;
    }
    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }    
}

