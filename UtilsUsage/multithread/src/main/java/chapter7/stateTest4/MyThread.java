package chapter7.stateTest4;

/**
 * @author nickChen
 * @create 2017-04-25 14:43.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            synchronized (Lock.lock){
                Lock.lock.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
