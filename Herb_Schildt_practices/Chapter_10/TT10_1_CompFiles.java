/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_10;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Chrissie
 */
public class TT10_1_CompFiles {
    
    public static void main(String[] args) {
        int i=0, j=0;
        
        if(args.length != 2) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
    }
        try (var f1 = new FileInputStream(args[0]); var f2 = new FileInputStream(args[1])) {
            do {
            i = f1.read();
            j = f2.read();
            if (i != j) break;
            }while (i != -1 && j != -1);
        if ( i != j) System.out.println("Files differ.");
        else System.out.println("Files are the same.");
        }
        catch (IOException exc){
                System.out.println("I/O Error: " + exc);
                }
        
        
    }
    
}
