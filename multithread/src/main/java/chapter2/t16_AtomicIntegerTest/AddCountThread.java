package chapter2.t16_AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类型不用上锁也可以完成线程安全的自增操作
 * @author nickChen
 * @create 2017-04-21 11:27.
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();
        for (int i = 0; i < 5; i++) {
            new Thread(countService).start();
        }
    }
}
