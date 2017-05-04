package chapter3.notifyAll;

/**
 * @author nickChen
 * @create 2017-04-21 14:29.
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notify();
        }
    }
}
