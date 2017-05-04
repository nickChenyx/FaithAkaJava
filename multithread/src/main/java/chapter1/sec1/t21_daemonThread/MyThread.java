package chapter1.sec1.t21_daemonThread;

/**
 * @author nickChen
 * @create 2017-04-20 9:48.
 */
public class MyThread extends Thread {
private int i = 0;

    @Override
    public void run() {
        try {
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
