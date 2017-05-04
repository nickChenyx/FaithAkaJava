package chapter2.t8.synBlockString;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 15:20.
 */
public class ServiceTest {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}