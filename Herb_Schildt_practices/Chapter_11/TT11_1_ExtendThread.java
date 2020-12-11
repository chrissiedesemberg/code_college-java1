package Chapter_11;

import java.sql.SQLOutput;

public class TT11_1_ExtendThread extends Thread {

    String threadName;

    public TT11_1_ExtendThread(String name) {
        this.threadName = name;
    }


    public String getThreadName() {
        System.out.println("Thread name: " + threadName);
        return threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " now started");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Int " + getName() + " count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " is terminating.");

    }

}

class ExtendThread {

    public static void main(String[] args) {

        TT11_1_ExtendThread threadFirst = new TT11_1_ExtendThread("'ThreadFirst'");
        threadFirst.getThreadName();

        Thread threadSecond = new Thread(threadFirst);
        Thread threadThird = new Thread(threadFirst);

        threadSecond.start();
        System.out.println("Thread second started, now starting thread third");
        threadThird.start();

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println("Main thread terminated");
            }
        }
        System.out.println("Main thread ended");


    }

}
