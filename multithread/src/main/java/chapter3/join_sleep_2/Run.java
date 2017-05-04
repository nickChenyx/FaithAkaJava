package chapter3.join_sleep_2;

/**
 * 可以看到 ThreadA中的b.join() 会释放锁，线程c 拿到了对象锁可以执行printService
 * @author nickChen
 * @create 2017-04-21 17:15.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
