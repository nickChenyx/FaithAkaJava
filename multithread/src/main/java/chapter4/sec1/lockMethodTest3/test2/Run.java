package chapter4.sec1.lockMethodTest3.test2;

/**
 * isHeldByCurrentThread 查询当前线程是否保持 lock的锁定
 * @author nickChen
 * @create 2017-04-24 13:41.
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread a = new Thread(runnable);
        a.start();
    }

}
