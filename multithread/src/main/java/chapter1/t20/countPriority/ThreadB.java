package chapter1.t20.countPriority;

/**
 * @author nickChen
 * @create 2017-04-20 9:39.
 */
public class ThreadB extends Thread {
private int count = 0;

    @Override
    public void run() {
        while(true){
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
