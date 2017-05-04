package chapter2.t16_volatileTestThread;

import static org.junit.Assert.*;

/**
 *
 count=7594
 count=7594
 count=7594
 * @author nickChen
 * @create 2017-04-21 11:09.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new MyThread().start();
        }
    }
}