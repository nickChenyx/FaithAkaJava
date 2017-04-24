package chapter4.sec1.awaitUninterruptiblyTest_2;

/**
 * awaitUninterruptibly()
 * 相较于 await（） 是不可被interrupt 不会出现异常的
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
