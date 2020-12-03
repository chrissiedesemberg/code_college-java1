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
public class Hamburger {

    private String nameOfClient;
    private double basePrice = 0.0;
    private double totalPrice = 0.0;
    private String rollType;
    private String meatType;
    private double lettuce = 2.5;
    private double bacon = 10.0;
    private double cheese = 8.0;
    private double tomato = 12.0;
    private int toppingCounter;
    public String toppingsAddedString = "\t";
    double toppingPrice = 0;

    public Hamburger(String name, String meatType, String rollType) {
        this.nameOfClient = name;

        this.meatType = meatType;
        if (meatType == "chicken") {
            this.totalPrice += 20.00;
            basePrice += 20.0;
        } else if (meatType == "beef") {
            this.totalPrice += 28.0;
            basePrice = 28.0;
        }
        this.rollType = rollType;
        if (rollType == "plain") {
            this.totalPrice += 3.0;
            basePrice += 3.0;
        } else if (rollType == "seeded") {
            this.totalPrice += 6.0;
            basePrice += 6.0;
        }

        toppingCounter = 4;
    }

    //Getter and Setters:
    public void getBasePrice() {
        System.out.println("Base Price for burger is: " + basePrice);
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setPrice(double price) {
        this.totalPrice += price;
    }

    public void addTopping(String topping) {
        if (toppingCounter <= 0) {
            System.out.println("You cannot add anymore toppings");
        } else {
            switch (topping) {
                case "lettuce":
                    totalPrice += lettuce;
                    toppingCounter--;
                    toppingsAddedString += "lettuce @ " + lettuce + " - ";
                    System.out.println("Added lettuce");
                    break;
                case "bacon":
                    totalPrice += bacon;
                    toppingCounter--;
                    toppingsAddedString += "bacon @ " + bacon + " - ";
                    System.out.println("Added bacon");
                    break;
                case "cheese":
                    totalPrice += cheese;
                    toppingCounter--;
                    toppingsAddedString += "cheese @ " + cheese + " - ";
                    System.out.println("Added cheese");
                    break;
                case "tomato":
                    totalPrice += tomato;
                    toppingCounter--;
                    toppingsAddedString += "tomato @ " + tomato + " - ";
                    System.out.println("Added tomato");
                    break;
                default:
                    break;
            }
            System.out.println("Number of toppings still allowed " + toppingCounter + ".");
        }
    }

    public int getToppingCounter() {
        return toppingCounter;
    }

    public void setToppingCounter(int number) {
        this.toppingCounter = number;
    }

    public void adjustToppingCounter() {
        this.toppingCounter--;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void getOrder() {
        System.out.println("\n\nBurger order: \nRoll Type: " + rollType + "\nMeat Type: " + meatType
                + "\nToppings added: " + toppingsAddedString + "\nTotal price for burger is: R" + totalPrice + ".");

    }

    public double getPrice() {
        System.out.println("Total price for Burger is: " + totalPrice);
        return totalPrice;
    }

    public void listTopping() {
        System.out.println("\nToppings added: " + toppingsAddedString + "\n");

    }

}
