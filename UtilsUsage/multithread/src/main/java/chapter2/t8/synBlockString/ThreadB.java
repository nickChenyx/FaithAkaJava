package chapter2.t8.synBlockString;

/**
 * @author nickChen
 * @create 2017-04-20 15:19.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("B","BB");
    }
}
