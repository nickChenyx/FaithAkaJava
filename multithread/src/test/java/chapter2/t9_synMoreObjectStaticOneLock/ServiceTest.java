package chapter2.t9_synMoreObjectStaticOneLock;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 16:25.
 */
public class ServiceTest {
    public static void main(String[] args) {
        Service s1 = new Service();
        Service s2 = new Service();
        ThreadA a = new ThreadA(s1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(s2);
        b.setName("B");
        b.start();
    }

}