package chapter2.t3.synLockIn_1;

/**
 * @author nickChen
 * @create 2017-04-20 13:21.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
