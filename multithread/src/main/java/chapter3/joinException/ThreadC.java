package chapter3.joinException;

/**
 * @author nickChen
 * @create 2017-04-21 17:00.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
        System.out.println("C run end");
    }
}
