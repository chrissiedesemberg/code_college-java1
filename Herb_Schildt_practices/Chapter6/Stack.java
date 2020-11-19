/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

import Chapter5.*;

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

    void push(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    char pop() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

}
