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
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Base Burger\n");
        Hamburger baseBurger = new Hamburger("John Will", "chicken", "seeded");
        baseBurger.getBasePrice();
        baseBurger.addTopping("tomato");
        baseBurger.addTopping("bacon");
        baseBurger.addTopping("cheese");
        baseBurger.addTopping("tomato");
        baseBurger.addTopping("cheese");
        baseBurger.listTopping();
        baseBurger.getPrice();  
        baseBurger.getOrder();  
        
        System.out.println("\n****************\n\n");
        
        System.out.println("Health Burger\n");
        
        HealthBurger healthBurger = new HealthBurger("Jane Will", "chicken", "seeded");
        healthBurger.getBasePrice();
        healthBurger.addTopping("tomato");
        healthBurger.addTopping("bacon");
        healthBurger.addTopping("feta");
        healthBurger.addTopping("tomato");
        healthBurger.addTopping("eggplant");
        healthBurger.addTopping("tomato");
        healthBurger.addTopping("tomato");
        healthBurger.listTopping();
        healthBurger.getPrice(); 
        healthBurger.getOrder();  
        
        System.out.println("\n****************\n\n");
        System.out.println("Deluxe Burger\n");
                
        DeluxeBurger deluxeBurger = new DeluxeBurger("Phat Phil", "beef", "seeded");
        deluxeBurger.addTopping("tomato");
        deluxeBurger.getBasePrice();
        deluxeBurger.getPrice();
        deluxeBurger.getOrder();  
        
        
        System.out.println("\n****************\n\n");
        
    }
    
}
