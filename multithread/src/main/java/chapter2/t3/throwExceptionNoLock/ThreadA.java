package chapter2.t3.throwExceptionNoLock;

/**
 * @author nickChen
 * @create 2017-04-20 13:39.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
