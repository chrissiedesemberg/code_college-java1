/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section7.CompositionChallenge_91.OOPMasterChallenge;

/**
 *
 * @author Chrissie
 */
public class HealthBurger extends Hamburger{
    
    private double eggPlant = 8;
    private double feta = 4;

    public HealthBurger(String name, String meatType, String rollType) {
        super(name, meatType, rollType);      
        rollType = "brown rye bread";
        super.setPrice(42.0);
        setBasePrice(42);
        
        setToppingCounter(6);
        
    }
    
    @Override
    public void addTopping(String topping) {
        
        super.addTopping(topping);
        
        if (getToppingCounter() <= 0) System.out.println("You cannot add anymore toppings");
        else {
            switch (topping) {
                case "eggplant":
                    setPrice(eggPlant);
                    adjustToppingCounter();
                    toppingsAddedString += " eggPlant - ";
                    System.out.println("You have added extra eggPlant as a topping. You can still add " + getToppingCounter() + " toppings.");
                    break;
                case "feta":
                    setPrice(feta);
                    adjustToppingCounter();
                    toppingsAddedString += " feta - ";
                    System.out.println("You have added extra Feta as a topping. You can still add " + getToppingCounter() + " toppings.");
                    break;
                default:
                    break;
            } 
        }
       
        }
    
    @Override
    public void listTopping() {
        
        String toppingName = "";
        double toppingPrice = 0;
        
        super.listTopping();
        
        if (toppingsAddedString == "eggPlant") {toppingName = "Egg Plant"; toppingPrice = eggPlant;}
        else if (toppingsAddedString == "feta") {toppingName = "Feta"; toppingPrice = feta;}
        
        System.out.println("\nTopping added: " + toppingName + " @ additional price: " + toppingPrice);
    }
    
    
}
