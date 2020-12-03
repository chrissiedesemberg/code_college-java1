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
public class Porsche extends Car{
    
        private int color;
    private int engineSize;
    private int doors;

    public Porsche(String name, int cylinders, int color, int engineSize, int doors ) {
        super(name, cylinders);
        this.color = color;
        this.engineSize = engineSize;
        this.doors = doors;
    }
    
    @Override
    public String startEngine() {
        
        return "Porsche Class - Engine Started - ROARING!!";
        
    }
    
     @Override
    public String accelerate() {
        
        return "Porsche Class - Whiplashed!.";
        
    }
    
     @Override
    public String brake() {
        return "Porsche Class - car halted to a stop - good brakes";
    }
    
    
}
