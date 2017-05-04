package chapter2.t16_AtomicIntegerNoSafe;

/**
 * @author nickChen
 * @create 2017-04-21 11:32.
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
