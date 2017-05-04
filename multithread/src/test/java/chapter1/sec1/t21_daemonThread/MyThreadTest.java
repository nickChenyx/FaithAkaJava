package chapter1.sec1.t21_daemonThread;

import static org.junit.Assert.*;

/**
 * 守护线程，在最后一个守护线程结束之后，再结束
 * @author nickChen
 * @create 2017-04-20 9:50.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(3000);
            System.out.println("我离开了 thread对象也不在打印了，thread对象停止了");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }



}