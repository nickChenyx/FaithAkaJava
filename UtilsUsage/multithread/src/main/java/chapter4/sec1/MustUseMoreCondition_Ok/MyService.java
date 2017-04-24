package chapter4.sec1.MustUseMoreCondition_Ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 10:58.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition c1 = lock.newCondition();
    public Condition c2 = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA");
            c1.await();
            System.out.println("  end awaitA");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB");
            c2.await();
            System.out.println("  end awaitB");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_1() {
        try {
            lock.lock();
            System.out.println("signalAll-1");
            c1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signalAll_2() {
        try {
            lock.lock();
            System.out.println("signalAll-2");
            c2.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
