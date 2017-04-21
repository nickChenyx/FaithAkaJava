package chapter3.wait_notify_size5;

import static org.junit.Assert.*;

/**
 * 线程b在size不等于5的时候调用wait阻塞自己，释放锁。
 * 线程a在size等于5的时候调用notify唤醒线程b，等执行完线程中的工作之后，释放锁。
 * 线程b被线程a的notify唤醒
 * @author nickChen
 * @create 2017-04-21 13:54.
 */
public class MyListTest {
    public static void main(String[] args)throws InterruptedException {
        MyList list = new MyList();
        Object lock = new Object();
        ThreadB b = new ThreadB(lock,list);
        b.setName("B");
        b.start();
        Thread.sleep(50);
        ThreadA a = new ThreadA(lock,list);
        a.setName("A");
        a.start();

    }

}