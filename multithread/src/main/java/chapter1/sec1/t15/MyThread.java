package chapter1.sec1.t15;

/**
 * 被标记为中断了，先运行for loop ，一旦进入睡眠。
 * java.lang.InterruptedException: sleep interrupted
 * 终止线程
 * @author nickChen
 * @create 2017-04-19 17:29.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            super.run();
            for (int i = 0; i < 10000; i++) {
                System.out.println("i="+i);
            }
            System.out.println("run begin");
            Thread.sleep(2000000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep，进入catch");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
