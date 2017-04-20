package chapter2.t9_synTwoLock;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 16:12.
 */
public class ServiceTest {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        ThreadC c = new ThreadC(service);
        a.setName("A");
        b.setName("B");
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }

}