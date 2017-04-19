package chapter1.sec1;

/**
 * @author nickChen
 * @create 2017-04-19 11:28.
 */
public class MyThreadA extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
