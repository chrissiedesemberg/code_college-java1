/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.qpack;

/**
 *
 * @author Chrissie
 */
public class FixedQueue implements TT8_1_ICharQ {

    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc ++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue us empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

}
