package chapter2.t5.synchronizedOneThreadIn;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 14:11.
 */
public class ObjectServiceTest {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("a");
        b.setName("B");
        a.start();
        b.start();
    }
}