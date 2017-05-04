package chapter2.t2.synchronizedMethodLockObject2;

/**
 * @author nickChen
 * @create 2017-04-20 11:11.
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
