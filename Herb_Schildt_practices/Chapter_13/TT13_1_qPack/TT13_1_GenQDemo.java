package Chapter_13.TT13_1_qPack;

import Chapter9.QueueEmptyException;
import Chapter9.QueueFullException;

public class TT13_1_GenQDemo {

    public static void main(String[] args) {

        Integer iStore[] = new Integer[10];
        TT13_1_GenQueue<Integer> q = new TT13_1_GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("\n------- Demonstrating a queue of Integers ------");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to a q.");
                q.put(i);
            }
        }catch (QueueFullException qf) {
            System.out.println(qf);
        }
        System.out.println();

        try {
            for (int i = 0; i< 5; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        //Creating a Double queue

        Double dStore[] = new Double[10];
        TT13_1_GenQueue<Double> q2 = new TT13_1_GenQueue<>(dStore);

        Double dVal;

        System.out.println("\n------- Demonstrate a queue of Doubles ------- ");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i/2 + " to q2.");
                q2.put((double)i/2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
             for(int i=0; i < 5; i++) {
                 System.out.print("Getting next Double from q2: ");
                 dVal = q2.get();
                 System.out.println(dVal);
             }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }

}
