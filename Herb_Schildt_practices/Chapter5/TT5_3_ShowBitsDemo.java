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
public class TT5_3_ShowBitsDemo {

    public static void main(String[] args) {
            ShowBits b = new ShowBits(8);
            ShowBits i = new ShowBits(32);
            ShowBits ii = new ShowBits(64);
            
            System.out.println("123 in binary: ");
            b.show(123);
            System.out.println("");
            
            System.out.println("87894 in binary: ");
            i.show(87894);
            System.out.println("");
                     
            System.out.println("831349031 in binary: ");
            ii.show(831349031);
            System.out.println("");
            
            
    }
    
}
