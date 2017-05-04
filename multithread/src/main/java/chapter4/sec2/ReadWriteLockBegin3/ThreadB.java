package chapter4.sec2.ReadWriteLockBegin3;

/**
 * @author nickChen
 * @create 2017-04-24 15:18.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
