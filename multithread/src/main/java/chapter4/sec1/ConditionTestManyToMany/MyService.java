package chapter4.sec1.ConditionTestManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 11:14.
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (hasValue==true){
                //可能唤醒同类
                System.out.println("print*** 有可能连续打印");
                condition.await();
            }
            System.out.println("print*");
            hasValue=true;
//            condition.signal();
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (hasValue==false){
                System.out.println("print### 有可能连续打印");
                condition.await();
            }
            System.out.println("print#");
            hasValue=false;
//            condition.signal();
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
