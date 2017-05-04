package chapter1.t6;

/**
 * @author nickChen
 * @create 2017-04-19 13:35.
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("constructor :" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("method -> run : "+Thread.currentThread().getName());
    }
}
