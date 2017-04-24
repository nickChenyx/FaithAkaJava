package chapter4.sec1.ReentrantLockTest;

/**
 * ReentrantLock 实现同步
 * @author nickChen
 * @create 2017-04-24 10:21.
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        for (int i = 0; i < 5; i++) {
             new MyThread(service).start();
        }
    }

}
