package chapter7.stateTest1;

/**
 * @author nickChen
 * @create 2017-04-25 14:06.
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run 方法中的状态："+ Thread.currentThread().getState());
    }
}
