/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.CodingExercise36_PoolArea;

/**
 *
 * @author Chrissie
 */
public class Cuboid extends Rectangle {
    
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("rect.width = " + rect.getWidth());
        System.out.println("rect.length = " + rect.getLength());
        System.out.println("rect.area = " + rect.getArea());
        
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width = " + cuboid.getWidth()); 
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());
        
        
    }
    
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        
        if (height < 0) this.height = 0;
        else this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    public double getVolume() {
       return getArea() * height;
    }  
}
