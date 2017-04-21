package chapter3.joinMoreTest;

/**
 * @author nickChen
 * @create 2017-04-21 17:13.
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        try {
            System.out.println("b run begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end  time="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void bService() {
        System.out.println("print bService time="+System.currentTimeMillis());
    }
}
