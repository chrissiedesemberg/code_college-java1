/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.qpack;

import Chapter8.qpack.TT8_1_ICharQ;

/**
 *
 * @author Chrissie
 */






public class TT8_1_IQDemo {

    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        TT8_1_ICharQ iQ;

        char ch;
        int i;
        iQ = q1;

        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.println("Contents of fixed queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");

        iQ = q2;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));

            System.out.println("Contents of dynamic queue: ");
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println("");

            iQ = q3;
            for (i = 0; i < 10; i++) {
                iQ.put((char) ('A' + i));
            }
            System.out.println("Contents of circular queue: ");
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
            System.out.println("");

            for (i = 10; i < 20; i++) {
                iQ.put((char) ('A' + i));
            }

            System.out.println("Contents of Circular queue: ");
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }

            System.out.println("\n Store and consume from circular queue.");
            for (i = 0; i < 20; i++) {
                iQ.put((char) ('A' + i));
                ch = iQ.get();
                System.out.print(ch);
            }
        }
    }

}
