package chapter2.t9_static_class_sync;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 16:08.
 */
public class ServiceTest {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        ThreadB b = new ThreadB();
        b.setName("B");
        a.start();
        b.start();
    }

}