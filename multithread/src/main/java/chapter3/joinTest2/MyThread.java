package chapter3.joinTest2;

/**
 * @author nickChen
 * @create 2017-04-21 16:45.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int  secondValue = (int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
