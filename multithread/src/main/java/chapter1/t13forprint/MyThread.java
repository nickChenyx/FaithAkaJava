package chapter1.t13forprint;

/**
 * for 循环里通过判断 退出了循环
 * 但是线程并没有停止 for 循环外的语句还是被执行了
 * @author nickChen
 * @create 2017-04-19 16:28.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()){
                System.out.println("already stopped , exit");
                break;
            }
            System.out.println("i="+i);
        }
        System.out.println("still running .... thread not stop");
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
    }
}
