package chapter1.sec1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-19 13:08.
 */
public class MyThreadDTest {
    @org.junit.Test
    public void run() throws Exception {
        MyThreadC myThreadC = new MyThreadC();
        for (int i = 0; i < 10; i++) {
            new Thread(myThreadC,String.valueOf(i)).start();
        }
        Thread.sleep(1000);
    }

}