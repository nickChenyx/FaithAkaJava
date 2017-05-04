package chapter3.join_sleep_2;

/**
 * @author nickChen
 * @create 2017-04-21 17:15.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
