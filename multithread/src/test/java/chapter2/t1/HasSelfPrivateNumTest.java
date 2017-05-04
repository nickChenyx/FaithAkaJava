package chapter2.t1;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 10:20.
 */
public class HasSelfPrivateNumTest {
     public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(numRef);
        ThreadB b = new ThreadB(numRef);
        a.start();
        b.start();
    }

}