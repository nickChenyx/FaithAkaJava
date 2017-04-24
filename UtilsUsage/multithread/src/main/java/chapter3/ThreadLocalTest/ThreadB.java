package chapter3.ThreadLocalTest;

import java.util.Date;

/**
 * @author nickChen
 * @create 2017-04-24 9:52.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Tools.tl.set(new Date());
                System.out.println("ThreadB get Value="+Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
