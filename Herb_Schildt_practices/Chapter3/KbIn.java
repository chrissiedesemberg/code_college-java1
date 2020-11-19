/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;
import java.io.IOException;
/**
 *
 * @author Chrissie
 */
public class KbIn {
    public static void main(String[] args) 
        throws java.io.IOException {
            char ch;
            System.out.println("Press key followed by ENTER: ");
                   
        ch = (char) System.in.read();
        System.out.println("Your key is: " + ch);
        
    }
}
