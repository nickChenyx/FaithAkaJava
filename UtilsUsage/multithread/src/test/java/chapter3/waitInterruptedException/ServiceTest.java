package chapter3.waitInterruptedException;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 14:22.
 */
public class ServiceTest {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(3000);
            a.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}