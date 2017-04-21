package chapter3.Test2;

/**
 * @author nickChen
 * @create 2017-04-21 13:44.
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("start  wait time="+System.currentTimeMillis());
                lock.wait();
                System.out.println("end    wait time="+System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
