package chapter1.t17;

/**
 * 说明 yield 会释放对象锁，重新进入队列。
 * @author nickChen
 * @create 2017-04-21 14:09.
 */
public class YieldLock extends Thread {
    private volatile static int i = 0;
    @Override
    public void run() {
        synchronized ("1"){
            try {
                Thread.sleep(50);
                Thread.yield();
                for (int j = 0; j < 3; j++) {
                    System.out.println(j+"->"+Thread.currentThread().getName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+": "+i++);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new YieldLock().start();
        }
    }
}
