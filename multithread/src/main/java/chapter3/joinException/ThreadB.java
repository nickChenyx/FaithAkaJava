package chapter3.joinException;

/**
 * @author nickChen
 * @create 2017-04-21 16:57.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B 在 run 结束处打印");
        } catch (Exception e) {
            System.out.println("线程B 在catch 内打印");
            e.printStackTrace();
        }
    }
}
