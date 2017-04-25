package chapter1.t15;

/**
 * stop 会抛出 java.lang.ThreadDeath异常
 * @author nickChen
 * @create 2017-04-19 17:37.
 */
public class MyThreadB extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了 catch 方法");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreadB thread = new MyThreadB();
        thread.start();
    }
}
