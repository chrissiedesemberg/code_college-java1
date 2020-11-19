/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author Chrissie
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if (a < b) {
            System.out.println("a is less than b");
        }
        else if (a == b){
            System.out.println("a is equal to b");
        }
        
        c = a - b;
        if (c >= 0) {
            System.out.println("c is non-negative");
        }
        else {
            System.out.println("c is negative");
        }
        
        
    }
   
}
