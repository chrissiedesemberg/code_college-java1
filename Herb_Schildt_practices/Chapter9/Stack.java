/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;
/**
 *
 * @author Chrissie
 */
public class Stack {

    char q[];
    int putloc, getloc;

     Stack(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void push(char ch) throws QueueFullException{
        if (putloc == q.length) throw new QueueFullException(q.length);
        q[putloc++] = ch;
    }

    char pop() throws QueueEmptyException{
        if (getloc == putloc) throw new QueueEmptyException();
        return q[getloc++];
    }

}
