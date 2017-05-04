package chapter1.sec1.t11;

/**
 * @author nickChen
 * @create 2017-04-19 14:22.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            System.out.println("i="+(i+1));
        }
    }
}
