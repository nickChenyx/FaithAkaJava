package chapter3.joinMoreTest;

/**
 * @author nickChen
 * @create 2017-04-21 17:12.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                System.out.println("a run begin time="+System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("a run end  time="+System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
