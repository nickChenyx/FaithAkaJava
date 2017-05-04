package chapter4.sec1.MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 10:49.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition=lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA");
            condition.await();
            System.out.println("end awaitA");
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
            condition.await();
            System.out.println("end awaitB");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        try {
            lock.lock();
            System.out.println("signalAll");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
