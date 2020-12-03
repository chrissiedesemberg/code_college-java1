/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6;

/**
 *
 * @author Chrissie
 */
public class CodingExercise31_WallArea {
    
    private double width;
    private double height;
    
    public CodingExercise31_WallArea(){
        
        
    }
    
    public CodingExercise31_WallArea(double width, double height){
       
               
        if (width < 0) {
            this.width = 0;
            this.height = height;
        }
        if (height < 0) {
            this.height = 0;  
            this.width = width;
        }
        else {
                this.width = width;
                this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        
        if (width < 0) 
            this.width = 0;
        
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) 
            this.height = 0;  
        
        this.height = height;
    }
    
    
    public double getArea() {
        
        return height * width;
        
    }
    
}
