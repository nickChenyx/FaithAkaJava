package chapter4.sec1.awaitUninterruptiblyTest_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author nickChen
 * @create 2017-04-24 14:31.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.awaitUninterruptibly();
            System.out.println("wait end");
        } catch (Exception e) {
            System.out.println("catch");
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
