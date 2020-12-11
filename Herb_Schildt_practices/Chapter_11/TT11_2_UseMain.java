package Chapter_11;

public class TT11_2_UseMain extends Thread{

    public static void main(String[] args) {
        Thread thrd;

        //Get the main thread
        thrd = Thread.currentThread();

        //Display main thread name
        System.out.println("Main thread is called: " + thrd.getName());

        //Display main thread priority
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        //set the name and priority
        System.out.println("Priority: " + thrd.getPriority());
        System.out.println("Setting name and priority. \n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Main thread is now called: " + thrd.getName());

        System.out.println("Priority is now: " + thrd.getPriority());
    }

}
