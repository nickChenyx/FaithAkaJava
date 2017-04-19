package chapter1.sec1.t13_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-19 17:21.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

}