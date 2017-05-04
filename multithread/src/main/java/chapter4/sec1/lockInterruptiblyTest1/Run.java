package chapter4.sec1.lockInterruptiblyTest1;

/**
 * lockInterruptibly() 如果当前线程未被中断，则获取锁定；如果已经被中断，则出现异常。
 * @author nickChen
 * @create 2017-04-24 13:59.
 */
public class Run {
    public static void main(String[] args) throws Exception{
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myService.waitMethod();
            }
        };
        Thread a = new Thread(runnable,"A");
        a.start();
        Thread.sleep(500);
        Thread b = new Thread(runnable,"B");
        b.start();
        Thread.sleep(3000);
        b.interrupt();//打上中断的标记
        System.out.println("main end");
    }

}
