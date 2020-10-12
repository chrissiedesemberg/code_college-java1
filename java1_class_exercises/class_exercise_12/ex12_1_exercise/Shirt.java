/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_12.ex12_1_exercise;

/**
 *
 * @author Chrissie
 */
public class Shirt extends Item{
    
    private char size = 'U';
    
    public Shirt(double price, char size) {
        super ("Shirt", price);
        this.size = size;
    }
    
    public char getSize(){
        return size;
    }
    
    public void setSize(char size){
        this.size = size;
    }
}
