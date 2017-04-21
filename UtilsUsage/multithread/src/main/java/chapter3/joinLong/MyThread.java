package chapter3.joinLong;

/**
 * @author nickChen
 * @create 2017-04-21 17:06.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
