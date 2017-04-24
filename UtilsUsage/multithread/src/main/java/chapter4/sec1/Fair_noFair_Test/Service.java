package chapter4.sec1.Fair_noFair_Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 11:26.
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("ThreadName= "+Thread.currentThread().getName()+" is locked");

        } finally {
            lock.unlock();
        }
    }
}
