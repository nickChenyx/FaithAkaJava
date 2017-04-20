package chapter2.t7.doubleSynBlockOneTwo;

/**
 * @author nickChen
 * @create 2017-04-20 14:49.
 */
public class ThreadA extends Thread {
    private ObjectService service;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodA();
    }
}



