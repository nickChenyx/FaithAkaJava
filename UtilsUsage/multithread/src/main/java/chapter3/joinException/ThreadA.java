package chapter3.joinException;

/**
 * @author nickChen
 * @create 2017-04-21 16:56.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
