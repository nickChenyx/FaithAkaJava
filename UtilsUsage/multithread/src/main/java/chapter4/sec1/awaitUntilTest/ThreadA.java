package chapter4.sec1.awaitUntilTest;

/**
 * @author nickChen
 * @create 2017-04-24 14:44.
 */
public class ThreadA extends  Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
