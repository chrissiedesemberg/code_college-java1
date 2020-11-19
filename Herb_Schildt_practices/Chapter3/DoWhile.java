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
public class DoWhile {
    
    public static void main(String[] args) throws java.io.IOException {
    
        char ch;
        
        do {
           
            System.out.println("Please press a key followed by ENTER: ");
            ch = (char) System.in.read();
       
        }
        while(ch != 'q');
        
    }
}
