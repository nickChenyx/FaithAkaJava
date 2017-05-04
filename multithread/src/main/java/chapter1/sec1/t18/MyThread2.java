package chapter1.sec1.t18;

/**
 * @author nickChen
 * @create 2017-04-20 9:21.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+ this.getPriority());
    }
}
