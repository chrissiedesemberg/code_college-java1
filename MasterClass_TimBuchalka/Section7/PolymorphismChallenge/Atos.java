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
public class Atos extends Car {
    
    private int color;
    private int engineSize;
    private int doors;

    public Atos(String name, int cylinders, int color, int engineSize, int doors ) {
        super(name, cylinders);
        this.color = color;
        this.engineSize = engineSize;
        this.doors = doors;
    }
    
    @Override
    public String startEngine() {
        
        return "Atos Class - Engine Started - sounds like a sewing machine!!";
        
    }
    
     @Override
    public String accelerate() {
        
        return "Atos Class - Car accelerating - I think.";
        
    }
    
     @Override
    public String brake() {
        return "Atos Class - car braking - it wasn't going fast anyway: ";
    }
    
    
    
    
}
