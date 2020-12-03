/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section7.CompositionChallenge_91;

/**
 *
 * @author Chrissie
 */
public class Lamp {

    private String style;
    private boolean battery;
    private int gloveRating;

    public Lamp(String style, boolean battery, int gloveRating) {
        this.style = style;
        this.battery = battery;
        this.gloveRating = gloveRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGloveRating() {
        return gloveRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> lamp turned on");
    }
    
    public void turnOff() {
        System.out.println("Lamp - lamp turned off");
    }
    
    
    
    
}
