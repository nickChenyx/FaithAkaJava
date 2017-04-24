package chapter4.sec1.awaitUntilTest;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 14:40.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println("wait begin time = "+ new Date());
            condition.awaitUntil(calendar.getTime());
            System.out.println("wait  end  time = "+new Date());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println("notify  begin time = "+new Date());
            condition.signalAll();
            System.out.println("notify    end  time= "+new Date());
        } finally {
            lock.unlock();
        }
    }
}
