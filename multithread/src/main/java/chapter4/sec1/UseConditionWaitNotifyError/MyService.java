package chapter4.sec1.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 10:35.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
