package chapter2.t16;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 10:08.
 */
public class RunThreadTest {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("isRunning 已经被赋值 false");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}