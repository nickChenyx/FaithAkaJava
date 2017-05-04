package chapter4.sec1.lockMethodTest3.test1;

/**
 * 判断是不是公平锁！
 * @author nickChen
 * @create 2017-04-24 13:32.
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
        final Service service1 = new Service(false);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread b = new Thread(runnable1);
        b.start();
    }

}
