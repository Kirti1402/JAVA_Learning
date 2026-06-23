package collections;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        List l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(5);
        l1.add(3);
        l1.add(4);
        Thread t1 = new Thread(() -> {
            for(int i=0;i<5;i++){
                l1.add(i);
                System.out.println("Thread 1: "+i);
            }
            }
        );
        Thread t2 = new Thread(() -> {
            for(int i=0;i<5;i++){
                l1.add(i);
                System.out.println("Thread 2: "+i);
            }
            }
        );
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        l1.size();

        System.out.println(l1);
    }
}


//In my example, I created a shared ArrayList and started two threads. Both threads were adding elements to the same list concurrently.

//Since ArrayList does not synchronize its methods, both threads can access and modify the internal array and size variable at the same time. This can lead to race conditions, data loss, or inconsistent results.

//Therefore, ArrayList is considered non-thread-safe.


//join() throws InterruptedException because it causes the current thread to wait until the target thread completes. During this waiting period, another thread may interrupt the waiting thread. 
// Java forces us to handle this possibility through InterruptedException.