package chapter3.waitHasParamMethod;

/**
 * wait(long) 可以在等待某一时间内是否有线程对锁进行唤醒，如果超过这个时间会自动唤醒；
 * 当然这个时间内有notify也会唤醒
 * @author nickChen
 * @create 2017-04-21 14:34.
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time=" + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait  end time=" + System.currentTimeMillis());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t= new Thread(runnable1);
        t.start();
    }

}
