package chapter7.stateTest2;

/**
 * @author nickChen
 * @create 2017-04-25 14:06.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(1000);
            System.out.println("  end sleep");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
