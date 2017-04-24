package chapter4.sec1.lockMethodTest1.test2;

/**
 * getQueueLength 可以得到正在等待当前锁的线程数
 * @author nickChen
 * @create 2017-04-24 11:41.
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
        try {
            Thread.sleep(2000);
            System.out.println("有线程数："+service.lock.getQueueLength()+" 在等待获取锁！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
