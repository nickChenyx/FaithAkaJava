package chapter1.sec1.t13;

/**
 * 线程被中断即刻退出循环
 * @author nickChen
 * @create 2017-04-19 15:00.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()){
                System.out.println("already stopped , exit");
                break;
            }
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
