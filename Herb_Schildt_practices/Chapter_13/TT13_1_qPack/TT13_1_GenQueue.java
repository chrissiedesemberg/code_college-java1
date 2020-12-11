package Chapter_13.TT13_1_qPack;

import Chapter9.QueueEmptyException;
import Chapter9.QueueFullException;

class TT13_1_GenQueue<T> implements TT13_1_IGenQ<T>{

    private T q[];
    private int putloc, getloc;

    public TT13_1_GenQueue(T[] aRef) {
        this.q = aRef;
        putloc = getloc = 0;
    }

    public void put(T obj) throws QueueFullException {
        if(putloc == q.length) throw new QueueFullException(q.length);

        q[putloc++] = obj;
        }

    public T get() throws QueueEmptyException {
        if(getloc == putloc) throw new QueueEmptyException();

        return q[getloc++];
    }
    }

