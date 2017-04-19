package chapter1.sec1.t5_sameNum;

import org.junit.Test;

/**
 * @author nickChen
 * @create 2017-04-19 13:30.
 */
public class MyThreadTest {
    @Test
    public void run() throws Exception {
        MyThread myThread = new MyThread();
        for (int i = 0; i < 5; i++) {
            new Thread(myThread).start();
        }
        Thread.sleep(100);
    }

}