package chapter2.t9;

import static org.junit.Assert.*;

/**
 * 没有在 MyService 里面对list上锁，导致两个线程同时读取到了list的size
 * 这就会引发脏读。解决办法就是给list上锁
 * @author nickChen
 * @create 2017-04-20 15:51.
 */
public class MyServiceTest {
    public static void main(String[] args) throws InterruptedException{
        MyOneList list = new MyOneList();
        ThreadA a = new ThreadA(list);
        ThreadB b = new ThreadB(list);
        a.setName("a");
        b.setName("b");
        a.start();
        b.start();
        Thread.sleep(6000);
        System.out.println("listSize="+list.getSize());
    }
}