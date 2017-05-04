package chapter3.InheritableThreadLocal1;

/**
 * @author nickChen
 * @create 2017-04-24 10:06.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在线程A中取值："+Tools.tl.get());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
