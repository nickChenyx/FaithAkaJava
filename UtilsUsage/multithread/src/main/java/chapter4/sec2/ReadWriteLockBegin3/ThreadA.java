package chapter4.sec2.ReadWriteLockBegin3;

/**
 * @author nickChen
 * @create 2017-04-24 15:18.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
