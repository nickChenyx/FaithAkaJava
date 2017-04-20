package chapter2.t2.twoObjectTwoLock;

import static org.junit.Assert.*;

/**
 * synchronized 锁的是实例对象级别，有两个对象产生了两个锁。
 * 两个线程之间没有发生竞争关系，没有等待，所以结果是交叉出现的，依赖线程执行的速度
 * @author nickChen
 * @create 2017-04-20 10:40.
 */
public class HasSelfPrivateNumTest {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(numRef1);
        ThreadB b = new ThreadB(numRef2);
        a.start();
        b.start();
    }

}