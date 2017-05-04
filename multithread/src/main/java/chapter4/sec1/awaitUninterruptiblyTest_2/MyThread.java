package chapter4.sec1.awaitUninterruptiblyTest_2;

/**
 * @author nickChen
 * @create 2017-04-24 14:32.
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
