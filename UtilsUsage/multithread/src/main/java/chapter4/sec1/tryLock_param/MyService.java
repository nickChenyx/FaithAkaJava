package chapter4.sec1.tryLock_param;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 14:22.
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println("    "+Thread.currentThread().getName()+" 获得锁的时间:"+new Date());
                Thread.sleep(10000);
            }
            else{
                System.out.println("    "+Thread.currentThread().getName()+" 没有获得锁");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread())
                lock.unlock();
        }
    }

}
