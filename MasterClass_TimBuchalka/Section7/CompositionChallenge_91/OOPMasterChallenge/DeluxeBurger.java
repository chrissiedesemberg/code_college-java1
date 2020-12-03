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
public class DeluxeBurger extends Hamburger{
    
    final double chips = 15;
    final double drink = 10;

    public DeluxeBurger(String name, String meatType, String rollType) {
        super(name, meatType, rollType);      
        rollType = "brown rye bread";
        setBasePrice(58);
        setToppingCounter(0);
        
    }
    
    @Override
    public void addTopping(String topping) {
        System.out.println("No toppings can be added to Deluxe burger. Extras included in price: Chips & a drink.");
        }
    
    @Override
        public void getOrder() {
        System.out.println("\n\nBurger order: \nRoll Type: " + getRollType() + "\nMeat Type: " + getMeatType() + 
                "\nTotal price for burger is: R" + getPrice() + ". Burger comes with chips and a drink of your choice.");
    }
   
}
