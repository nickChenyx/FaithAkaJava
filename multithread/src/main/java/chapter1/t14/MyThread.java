package chapter1.t14;

/**
 * 在沉睡状态下停止线程，线程退出java.lang.InterruptedException: sleep interrupted
 * 中断状态值被清除 isInterrupted返回false
 * @author nickChen
 * @create 2017-04-19 17:23.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止了，进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
