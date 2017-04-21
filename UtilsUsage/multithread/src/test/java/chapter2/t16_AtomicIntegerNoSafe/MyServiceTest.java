package chapter2.t16_AtomicIntegerNoSafe;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 11:33.
 */
public class MyServiceTest {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            for (int i = 0; i < 5; i++) {
                new ThreadA(myService).start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}