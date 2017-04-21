package chapter3.Test2;

/**
 * t1线程调用wait后挂起，并释放了对象锁；
 * t2线程调用notify，先执行完线程内的任务后，再释放锁，将wait阻塞中的程序唤醒。
 * @author nickChen
 * @create 2017-04-21 13:47.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(2000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
