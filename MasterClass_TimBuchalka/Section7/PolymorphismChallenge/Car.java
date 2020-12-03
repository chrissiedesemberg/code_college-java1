/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section7.PolymorphismChallenge;

/**
 *
 * @author Chrissie
 */
public class Car {
    
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
    
    public String startEngine() {
        
        return "Base Class - Engine Started!";
        
    }
    
    public String accelerate() {
        
        return "Base Class - Car accelerated";
        
    }
    
    public String brake() {
        return "Base Class - Braking: ";
    }
    
    
    
    
    
}
