package chapter4.sec1.lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author nickChen
 * @create 2017-04-24 13:04.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition  condition = lock.newCondition();

    public void waitMethod() {
        try{
            lock.lock();
            condition.await();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有 "+lock.getWaitQueueLength(condition)+" 个线程正在等待condition");
        } finally {
            lock.unlock();
        }
    }

}
