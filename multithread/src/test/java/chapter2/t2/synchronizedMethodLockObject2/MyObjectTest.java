package chapter2.t2.synchronizedMethodLockObject2;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 11:32.
 */
public class MyObjectTest {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }

}