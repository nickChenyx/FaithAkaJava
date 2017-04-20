package chapter2.t9_synMoreObjectStaticOneLock;



/**
 * @author nickChen
 * @create 2017-04-20 16:11.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}
