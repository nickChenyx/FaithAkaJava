package chapter4.sec2.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author nickChen
 * @create 2017-04-24 15:15.
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁 "+Thread.currentThread().getName());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
