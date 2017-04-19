package chapter1.sec1;

/**
 * @author nickChen
 * @create 2017-04-19 11:22.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
