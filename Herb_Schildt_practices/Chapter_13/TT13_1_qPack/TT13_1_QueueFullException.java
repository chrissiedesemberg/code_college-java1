package Chapter_13.TT13_1_qPack;

public class TT13_1_QueueFullException extends Exception{

    int size;

    public TT13_1_QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nQueue is full - maximum size is " + size +
                '.';
    }
}
