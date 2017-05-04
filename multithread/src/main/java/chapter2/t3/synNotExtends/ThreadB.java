package chapter2.t3.synNotExtends;

/**
 * @author nickChen
 * @create 2017-04-20 13:48.
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
