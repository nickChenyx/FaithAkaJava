package chapter2.t9_static_class_sync;

/**
 * @author nickChen
 * @create 2017-04-20 16:08.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
