package chapter4.sec1.awaitUninterruptiblyTest_1;

/**
 * await（）进入等待装天下
 * 线程会被interrupt 成功中断 抛出异常 java.lang.InterruptedException
 * @author nickChen
 * @create 2017-04-24 14:33.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread thread = new MyThread(service);
            thread.start();
            Thread.sleep(3000);
            thread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
