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
public class DynQueue implements TT8_1_ICharQ {

    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            char t[] = new char[q.length * 2];

            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];

            q = t;
            }
        }
        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue us empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}
