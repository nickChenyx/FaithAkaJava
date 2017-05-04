package chapter4.sec1.tryLockTest;

/**
 * tryLock() 作用是：仅在调用时，锁定未被另一个线程保持情况下，才获取该锁定。
 * @author nickChen
 * @create 2017-04-24 14:18.
 */
public class Run {
    public static void main(String[] args) {
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myService.waitMethod();
            }
        };
        Thread a = new Thread(runnable,"A");
        a.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread b = new Thread(runnable,"B");
        b.start();
    }

}
