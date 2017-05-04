package chapter2.t5.synchronizedOneThreadIn;

/**
 * @author nickChen
 * @create 2017-04-20 14:11.
 */
public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethod();
    }
}
