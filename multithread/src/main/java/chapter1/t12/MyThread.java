package chapter1.t12;

/**
 * @author nickChen
 * @create 2017-04-19 14:27.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200000; i++) {
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(300);
            thread.interrupt();
            /**
             * Thread.interrupted() 获取的是当前线程是否中断
             * main线程很明显没有中断过
             */
            System.out.println("Stop 1? ="+Thread.interrupted());//false
            System.out.println("Stop 2? ="+Thread.interrupted());//false
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
