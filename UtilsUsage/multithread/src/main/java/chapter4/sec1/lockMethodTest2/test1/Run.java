package chapter4.sec1.lockMethodTest2.test1;

/**
 * hasQueuedThread 查询指定线程是否在等待获取此锁
 * hasQueuedThreads 查询是否有线程在等待获取此锁
 * @author nickChen
 * @create 2017-04-24 13:14.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread a = new Thread(runnable,"A;");
        a.start();
        Thread.sleep(1000);
        Thread b = new Thread(runnable,"B");
        b.start();
        Thread.sleep(1000);
        System.out.println(service.lock.hasQueuedThread(a));
        System.out.println(service.lock.hasQueuedThread(b));
        System.out.println(service.lock.hasQueuedThreads());
    }

}
