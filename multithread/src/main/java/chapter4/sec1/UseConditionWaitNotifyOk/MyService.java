package chapter4.sec1.UseConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 10:35.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("Await time="+System.currentTimeMillis());
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("unlocked!!!");
        }
    }

    public void signal () {
        try {
            lock.lock();
            System.out.println("signal time="+System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

}
