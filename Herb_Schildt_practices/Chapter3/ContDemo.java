/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author Chrissie
 */
public class ContDemo {
    public static void main(String[] args) {
        
        int i;
        
        for (i = 0; i <= 100; i++) {
        if((i%2) != 0) continue; 
            System.out.println(i);
        }
       
        
    }
}
