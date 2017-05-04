package chapter4.sec1.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 10:19.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName: "+Thread.currentThread().getName()+"   i="+i);
        }
        lock.unlock();
    }

}
