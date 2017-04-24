package chapter4.sec1.lockMethodTest3.test3;

/**
 * isLocked 查询此锁是否由任意线程保持了
 * @author nickChen
 * @create 2017-04-24 13:49.
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
       new Thread(runnable).start();

    }

}
