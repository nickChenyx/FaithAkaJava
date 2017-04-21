package chapter3.waitInterruptedException;

/**
 * @author nickChen
 * @create 2017-04-21 14:21.
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
