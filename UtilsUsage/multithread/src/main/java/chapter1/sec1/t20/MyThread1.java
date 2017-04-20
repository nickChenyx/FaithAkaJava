package chapter1.sec1.t20;

import java.util.Random;

/**
 * @author nickChen
 * @create 2017-04-20 9:26.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
                    Random random = new Random();
                    random.nextInt();
        }
        long end = System.currentTimeMillis();
        System.out.println("thread 1 use time="+(end-start)+"ms");
    }
}
