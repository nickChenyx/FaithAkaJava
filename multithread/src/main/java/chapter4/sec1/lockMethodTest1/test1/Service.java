package chapter4.sec1.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author nickChen
 * @create 2017-04-24 11:33.
 */
public class Service {
    private ReentrantLock lock  = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();lock.lock();lock.unlock();
            System.out.println("serviceMethod-1 getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod-2 getHoldCount="+lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
