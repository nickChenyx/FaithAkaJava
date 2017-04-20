package chapter2.t2.synchronizedMethodLockObject;

/**
 * @author nickChen
 * @create 2017-04-20 11:11.
 */
public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
