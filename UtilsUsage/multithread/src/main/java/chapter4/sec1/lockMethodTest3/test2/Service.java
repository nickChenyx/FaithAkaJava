package chapter4.sec1.lockMethodTest3.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 13:39.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }

}
