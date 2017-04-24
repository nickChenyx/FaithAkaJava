package chapter4.sec1.lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 13:27.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
