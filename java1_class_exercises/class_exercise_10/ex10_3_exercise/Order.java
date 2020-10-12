
package exercise_10.ex10_3_exercise;

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

    public void calcDiscount() {
        // Replace the if logic with a switch statement.

        switch (custType) {
            case 'N':
             discount = (total > 900 ? 10 : 5);
             break;
             case 'P':
             discount = (total > 900 ? 7 : 0);
             break;
             case 'C':
             discount = (total > 500 ? 8 : 5);   
            break;  
        }  
    }}

