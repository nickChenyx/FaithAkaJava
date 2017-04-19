package concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch  调用await（）会挂起一个或者一组线程，直到计数为0 。
 * //和await()类似，只不过等待一定的时间后count值还没变为0的话就会继续执行
 * public boolean await(long timeout, TimeUnit unit) throws InterruptedException { };
 * 参考：http://wosyingjun.iteye.com/blog/2223933
 * Created by nickChenyx on 2017/4/14.
 */
public class CountDownLatchUsage {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        new Thread(){
            @Override
            public void run() {
                System.out.println("子线程 1 正在工作");
                try{
                    sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
                System.out.println("子线程 1 工作完成");
                latch.countDown();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                System.out.println("子线程 2 正在工作");
                try{
                    sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
                System.out.println("子线程 2 工作完成");
                latch.countDown();
            }
        }.start();new Thread(){
            @Override
            public void run() {
                System.out.println("子线程 3 正在工作");
                try{
                    sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
                System.out.println("子线程 3 工作完成");
                latch.countDown();
            }
        }.start();
        try{
            System.out.println("等待子线程执行");
            // 挂起主线程
            latch.await();
            System.out.println("子线程执行完毕");
            System.out.println("主线程执行");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
