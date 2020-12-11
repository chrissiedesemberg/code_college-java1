package Chapter_11;

public class MyThread implements Runnable{
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public String getThreadName() {
        System.out.println("ThreadName: " + threadName);
        return threadName;
    }

    // Entry point of thread

    @Override
    public void run() {
        System.out.println(threadName + " starting.");
        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // First, construct a myThread object
        MyThread mt = new MyThread("Child 1");
        mt.getThreadName();
        // Second, construct a myThread object from previous object
        Thread mt2 = new Thread(mt);

        //Start thread
        mt2.start();

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try{
              Thread.sleep(100);
            } catch(InterruptedException exc){
                System.out.println("Main thread interrupted)");
            }
        }
        System.out.println("Main thread closed.");

    }


}
