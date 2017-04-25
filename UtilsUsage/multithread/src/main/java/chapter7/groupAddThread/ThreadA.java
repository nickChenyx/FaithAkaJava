package chapter7.groupAddThread;

/**
 * @author nickChen
 * @create 2017-04-25 14:47.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName: "+Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
