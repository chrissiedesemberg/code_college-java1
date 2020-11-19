/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.TT9_1;

import Chapter9.QueueFullException;
import Chapter9.QueueEmptyException;

/**
 *
 * @author Chrissie
 */






public class IQDemo {

    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;
        
        //overrun the queue
        try {
        for (i = 0; i < 10; i++) {
            System.out.println("Attempting to store : " + (char) ('A' + i));
            q.put((char) ('A' + i));
            System.out.print(" - OK");
        }
            System.out.println("");
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
            System.out.println("");
        }
        
        //over-empty the queue
        try {
            for (i = 0; i < 11; i++) {
                System.out.println("Getting next char: ");
                ch = q.get();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
            
//        System.out.println("Contents of fixed queue: ");
//        
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//        System.out.println("");
//        }
//
////            iQ = q2;
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('Z' - i));
//
//            System.out.println("Contents of dynamic queue: ");
//            for (i = 0; i < 10; i++) {
//                ch = iQ.get();
//                System.out.print(ch);
//            }
//
//            System.out.println("");
//
//            iQ = q3;
//            for (i = 0; i < 10; i++) {
//                iQ.put((char) ('A' + i));
//            }
//            System.out.println("Contents of circular queue: ");
//            for (i = 0; i < 10; i++) {
//                ch = iQ.get();
//                System.out.print(ch);
//            }
//            System.out.println("");
//
//            for (i = 10; i < 20; i++) {
//                iQ.put((char) ('A' + i));
//            }
//
//            System.out.println("Contents of Circular queue: ");
//            for (i = 0; i < 10; i++) {
//                ch = iQ.get();
//                System.out.print(ch);
//            }
//
//            System.out.println("\n Store and consume from circular queue.");
//            for (i = 0; i < 20; i++) {
//                iQ.put((char) ('A' + i));
//                ch = iQ.get();
//                System.out.print(ch);
//            }
//        }
    }

}
