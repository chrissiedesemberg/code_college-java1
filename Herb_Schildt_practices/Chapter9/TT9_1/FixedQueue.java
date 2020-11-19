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
class FixedQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length) throw new QueueFullException(q.length);
        q[putloc ++] = ch;
    }

    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }

}
