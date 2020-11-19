/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author Chrissie
 */
public class TT5_2QDemo {
   
    
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        
        System.out.println("Using bigQ to store the aplhabet.");
        for (i = 0; i < 26; i++) 
            bigQ.put((char) ('A' + i));
        
        System.out.println("Print elements of bigQ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch + " ");
        }
        System.out.println("\n");
        
        System.out.println("Using smallQ to print out errors.");
        for(i = 0; i <5; i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));
        smallQ.put((char) ('Z' - i));
        }
        System.out.println("");
        
        System.out.print("Contents of smallQ: \n");
        for(i = 0; i < 5; i++) {
            ch = smallQ.get(); 
        
            if(ch != (char) 0) System.out.println(ch);
        }
        
    }
}
