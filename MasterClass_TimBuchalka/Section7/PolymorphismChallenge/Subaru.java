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
public class Subaru extends Car {
    
       
    private int color;
    private int engineSize;
    private int doors;

    public Subaru(String name, int cylinders, int color, int engineSize, int doors ) {
        super(name, cylinders);
        this.color = color;
        this.engineSize = engineSize;
        this.doors = doors;
    }
    
    @Override
    public String startEngine() {
        
        return "Subaru Class - Engine Started - also sounds like a sewing machine!!";
        
    }
    
     @Override
    public String accelerate() {
        
        return "Subaru Class - Car accelerating.";
        
    }
    
     @Override
    public String brake() {
        return "Subaru Class - car braked";
    }
    
    
    
}
