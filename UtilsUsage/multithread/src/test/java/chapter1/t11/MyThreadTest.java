package chapter1.t11;

/**
 * 结果还是全部将 i 打印出来了
 * interrupt并没有终止线程
 * @author nickChen
 * @create 2017-04-19 14:23.
 */
public class MyThreadTest {

    public static void main(String[] args) throws Exception{
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}