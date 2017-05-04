package chapter3.join_sleep_1;

/**
 * @author nickChen
 * @create 2017-04-21 17:12.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                b.start();
                Thread.sleep(6000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
