package chapter2.t10;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 9:31.
 */
public class PrintStringTest {
    public static void main(String[] args) throws InterruptedException {
        PrintString ps = new PrintString();
        new Thread(ps).start();
        Thread.sleep(1000);
        System.out.println("我要停止他！ stopThreadName="+Thread.currentThread().getName());
        ps.setContinuePrint(false);
    }

}