
package exercise_10.ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (this.custType == 'N') {
            if (this.total > 900) {
                discount = 10;
            }
            else {
            discount = 8;
            }
        }
        else if (this.custType == 'P') {
            if (this.total > 900) {
                discount = 7;
            }
            else {
            discount = 0;
            }
        }
        else {
            if (this.total > 500) {
                discount = 8;
            }
            else {
            discount = 5;
            }
        }
    }