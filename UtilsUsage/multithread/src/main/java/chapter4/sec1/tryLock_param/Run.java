package chapter4.sec1.tryLock_param;

import java.util.Date;

/**
 * tryLock(long,TimeUnit) 如果锁在给定的等待时间内没有被另一个线程保持，且当前线程未被中断，则获取该锁。
 * @author nickChen
 * @create 2017-04-24 14:25.
 */
public class Run {
    public static void main(String[] args) {
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 调用 waitMethod 时间："+new Date());
                myService.waitMethod();
            }
        };
        new Thread(runnable,"A").start();
        new Thread(runnable,"B").start();
    }
}
