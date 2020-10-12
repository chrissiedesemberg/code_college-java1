/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8_pg271;

/**
 *
 * @author Chrissie
 */
public class Shirt {

    public String description;
    public char color;
    public double price;

    public void setField(String desc, char color, double price) {
        this.description = desc;
        this.color = color;
        this.price = price;
    }
    
    public void setColor(char color) {
        this.color = color;
    }
}
