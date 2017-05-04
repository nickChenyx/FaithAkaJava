package chapter2.t2;

import static org.junit.Assert.*;

/**
 * 结果错乱
 a set over
 b set over
 b num=200
 a num=200
 * @author nickChen
 * @create 2017-04-20 10:28.
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