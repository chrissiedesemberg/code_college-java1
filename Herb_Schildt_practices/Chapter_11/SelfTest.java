package Chapter_11;

public class SelfTest {
    public static void main(String[] args) {

//    1. How does Java’s multithreading capability enable you to write more efficient
//    programs?
        //it lets you utilize the idle time that is present in most programs

//    2. Multithreading is supported by the ___Thread___ class and the ___Runnable___ interface.

//    3. When creating a runnable object, why might you want to extend Thread rather than
//    implement Runnable?
        //it would allow you to override the methods you need, and not have to implement all
        //of the methods as with an interface. Keep you code clean.

//    4. Show how to use join( ) to wait for a thread object called MyThrd to end.
        //class JoinThread {
//                System.out.println("Main thread starting.");
//                MyThread mt = MyThread.createAndStart("Child #1");
//                MyThread mt2 = MyThread.createAndStart("Child #2");
//
//                try {
//                    mt.threadName.join();
//                    mt2.threadName.join();
//                } catch (InterruptedException ie) {
//                    System.out.println("Main trhead interrupted");
//                }
//                System.out.println("Main thread ending");

    //}
//5. Show how to set a thread called MyThrd to three levels above normal priority.
//                Priority mt1 = new Propertiety("High Priority");
//                Priority mt2 = new Propertiety("Normal Priority");
//
//                mt1.thread.setPriority(Thread.NORM_PRIORITY+1);
//                mt2.thread.setPriority(Thread.NORM_PRIORITY-1);

//    6. What is the effect of adding the synchronized keyword to a method?
//        When a synchronized method is called, the calling thread enters the object’s monitor,
//        which then locks the object. While locked, no other thread can enter the method, or
//        enter any other synchronized method defined by the object’s class. When the thread
//        returns from the method, the monitor unlocks the object, allowing it to be used by the
//        next thread. Thus, synchronization is achieved with virtually no programming effort on
//        your part.

//    7. The wait( ) and notify( ) methods are used to perform ___Syncronization___.

//    8. Change the TickTock class so that it actually keeps time. That is, have each tick take
//    one half second, and each tock take one half second. Thus, each ticktock
//    will take one second. (Don’t worry about the time it takes to switch tasks, etc.)
        //add : wait(0.5);

//    9. Why can’t you use suspend( ), resume( ), and stop( ) for new programs?
        // suspend( ) can sometimes cause serious problems that involve deadlock
        // resume( ) cannot be used without the suspend( ) method as its counterpart
        // stop( ) can sometimes cause serious problems.

//    10. What method defined by Thread obtains the name of a thread?
        //getName()

//    11. What does isAlive( ) return?
        // it returns true if the Thread is still running

//    12. On your own, try adding synchronization to the Queue class developed in previous
//    chapters so that it is safe for multithreaded use.


}
}
