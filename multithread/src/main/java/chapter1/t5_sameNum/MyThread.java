package chapter1.t5_sameNum;

/**
 * @author nickChen
 * @create 2017-04-19 13:28.
 */
public class MyThread extends Thread {
    private int i=5;

    @Override
    public void run() {
        // 在方法体内的i--依旧是非线程安全的
        System.out.println("i="+ (i--) +" threadName=" +
                Thread.currentThread().getName());
    }

}
