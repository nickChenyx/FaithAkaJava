package chapter4.sec1.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 10:27.
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin ThreadName: "+Thread.currentThread().getName()+ "  time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA   end ThreadName: "+Thread.currentThread().getName()+ "  time="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin ThreadName: "+Thread.currentThread().getName()+ "  time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB   end ThreadName: "+Thread.currentThread().getName()+ "  time="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
