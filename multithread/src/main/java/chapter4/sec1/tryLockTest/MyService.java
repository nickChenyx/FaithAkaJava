package chapter4.sec1.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 14:17.
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+ " 获得锁");
        }
        else{
            System.out.println(Thread.currentThread().getName()+ " 没有获得锁");
        }
    }

}
