package chapter4.sec1.lockMethodTest2.test2;

/**
 * hasWaiters(condition) 查询是否有线程正在等待与此锁有关的condition条件
 *
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
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();

        }
        Thread.sleep(2000);
        service.notifyMethod();
    }

}
