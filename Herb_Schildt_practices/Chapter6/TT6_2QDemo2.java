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
public class TT6_2QDemo2 {

    public static void main(String[] args) {

       Queue q1 = new Queue(10);
       
       char name[] = {'T', 'O', 'M'};
       Queue q2 = new Queue(name);
       
       char ch;
       int i;
       
       for(i = 0; i <10; i++) q1.put((char)('A' + i));
       
       Queue q3 = new Queue(q1);
       
        System.out.println("contents of q1:");
        for (i = 0; i < 10; i++) {
        ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("");
                System.out.println("contents of q2:");
        for (i = 0; i < 3; i++) {
        ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("");
    
        System.out.println("contents of q3:");
        for (i = 0; i < 10; i++) {
        ch = q3.get();
            System.out.print(ch);
        }
        System.out.println("");
        
    }
}
