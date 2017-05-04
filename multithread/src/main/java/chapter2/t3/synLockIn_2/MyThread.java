package chapter2.t3.synLockIn_2;

/**
 * @author nickChen
 * @create 2017-04-20 13:29.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateIMainMethod();
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
