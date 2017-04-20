package chapter2.t8.synBlockString;

/**
 * @author nickChen
 * @create 2017-04-20 15:19.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("A","AA");
    }
}
