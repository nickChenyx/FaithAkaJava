package chapter3.joinLong;

import static org.junit.Assert.*;

/**
 * 可以发现，
    myThread.join(2000);
    Thread.sleep(2000);
   这两个方法打印出来的结果都是一样的，都是等待了两秒钟内就end了。
   他们的区别在同步上。
   join（long）内部是调用wait(Long) ，也就是会把锁释放掉，
   而sleep（long）不释放锁 —— 在join_sleep_1包中验证
 * @author nickChen
 * @create 2017-04-21 17:06.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
//            myThread.join(2000);
            Thread.sleep(2000);
            System.out.println("  end time="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}