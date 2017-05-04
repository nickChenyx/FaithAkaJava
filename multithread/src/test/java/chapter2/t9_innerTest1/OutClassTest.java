package chapter2.t9_innerTest1;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 17:53.
 */
public class OutClassTest {
    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }

}