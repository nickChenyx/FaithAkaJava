package chapter1.t12;

/**
 * isInterrupted() 不会清除中断状态！
 * @author nickChen
 * @create 2017-04-19 14:40.
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(10);
            thread.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println("Stop 1? = "+thread.isInterrupted()); // true
            System.out.println("Stop 2? = "+thread.isInterrupted()); // true

        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
