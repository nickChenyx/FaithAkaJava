package chapter2.t16_synchronizedUpdateNewValue;

/**
 * @author nickChen
 * @create 2017-04-21 11:41.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
