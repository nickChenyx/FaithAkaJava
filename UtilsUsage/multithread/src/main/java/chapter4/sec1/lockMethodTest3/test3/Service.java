package chapter4.sec1.lockMethodTest3.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 13:48.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }

}
