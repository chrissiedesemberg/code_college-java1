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
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        
        for (i = 1; i <= 5; sum += i++);
    
        System.out.println("Sum is " + sum);
        
    }
}
