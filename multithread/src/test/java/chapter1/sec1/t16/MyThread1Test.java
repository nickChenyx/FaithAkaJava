package chapter1.sec1.t16;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-19 18:22.
 */
public class MyThread1Test {
    public static void main(String[] args) {
        try {
            MyThread1 t = new MyThread1();
            t.start();
            Thread.sleep(1000);
            t.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}