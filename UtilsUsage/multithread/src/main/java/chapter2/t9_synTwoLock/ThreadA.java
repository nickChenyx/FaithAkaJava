package chapter2.t9_synTwoLock;

/**
 * @author nickChen
 * @create 2017-04-20 16:11.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printA();
    }
}
