package chapter2.t16_AtomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 原子类的操作也不一定安全，因为方法是线程安全的，但是方法与方法之间并不是，
 * 下面的两次 addAndGet 操作导致了数据与预想的不同步
 * @author nickChen
 * @create 2017-04-21 11:31.
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    //可以使用 synchronized 来同步addNum方法保证数据安全
//    public synchronized void addNum(){
    public synchronized void addNum(){
        System.out.println(Thread.currentThread().getName()+ " after +100="+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }

}
