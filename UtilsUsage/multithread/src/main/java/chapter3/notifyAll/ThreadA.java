package chapter3.notifyAll;

/**
 * @author nickChen
 * @create 2017-04-21 14:28.
 */
public class ThreadA extends  Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
