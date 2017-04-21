package chapter3.Test2;

/**
 * @author nickChen
 * @create 2017-04-21 13:46.
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("start  notify time="+System.currentTimeMillis());
                lock.notify();
                System.out.println("end    notify time="+System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
