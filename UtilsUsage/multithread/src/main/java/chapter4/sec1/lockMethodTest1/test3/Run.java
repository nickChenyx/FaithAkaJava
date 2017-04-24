package chapter4.sec1.lockMethodTest1.test3;

/**
 * 返回等待与此锁定相关的给定条件condition的线程估计数，只是一个上限的估计数，因为会出现突发的timeout 和interrupt。
 * @author nickChen
 * @create 2017-04-24 13:05.
 */
public class Run {
    public static void main(String[] args) {
        final Service service =  new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
        try {
            Thread.sleep(2000);
            service.notifyMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
