package chapter1.sec1.t20;

import static org.junit.Assert.*;

/**
 * 线程具有随机性 ，优先级并不会绝对的展现出来，顺序还是随机性很高的
 * @author nickChen
 * @create 2017-04-20 9:36.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            MyThread1 t1 = new MyThread1();
            t1.setPriority(5);
            t1.start();
            MyThread2 t2 = new MyThread2();
            t2.setPriority(6);
            t2.start();
        }
    }
}