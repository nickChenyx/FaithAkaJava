package chapter4.sec1.lockInterruptiblyTest1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 13:55.
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lockInterruptibly();
//            lock.lock();
            System.out.println("lock begin "+Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newStr = new String();
                Math.random();
            }
            System.out.println("lock end "+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread())
                lock.unlock();
        }
    }
}
