package chapter4.sec1.lockMethodTest2.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 13:12.
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有没有线程正在等待condition？ "+
                                lock.hasWaiters(condition) + " 线程数是多少？ "+
                                lock.getWaitQueueLength(condition));
            condition.signal();
        } finally {
            lock.unlock();
        }
    }


}
