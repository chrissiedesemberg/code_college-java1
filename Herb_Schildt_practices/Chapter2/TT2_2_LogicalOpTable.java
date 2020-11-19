/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Chrissie
 */
public class TT2_2_LogicalOpTable {
    public static int boolToIntP(boolean p) {
        return p ? 1 : 0;
     }
 
        public static int boolToIntQ(boolean q) {
        return q ? 1 : 0;
     }
        
    public static void main(String[] args) {
        
        boolean p, q;        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
        
        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
        
        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
        
        p = false;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
        System.out.println("");
        System.out.println("");
        
        
    }

}
