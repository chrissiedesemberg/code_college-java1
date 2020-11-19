/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author Chrissie
 */
public class TT6_3QSDemo {
    
    public static void main(String[] args) {
        
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;
        
        System.out.println("Original array: ");
        for(i = 0; i < a.length; i++) System.out.print(a[i]);
        System.out.println("");
        
        Quicksort.qsort(a);
        
        System.out.print("Sorted array: ");
        for(i = 0; i < a.length; i++) System.out.print(a[i]);
        
        
    }
    
    
}
