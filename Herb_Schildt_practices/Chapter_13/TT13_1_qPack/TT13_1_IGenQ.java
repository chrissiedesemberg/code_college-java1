package Chapter_13.TT13_1_qPack;

import Chapter9.QueueEmptyException;
import Chapter9.QueueFullException;

public interface TT13_1_IGenQ <T>{

    void put(T ch) throws QueueFullException;
    T get() throws QueueEmptyException;




}
