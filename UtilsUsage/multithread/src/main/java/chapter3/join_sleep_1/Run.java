package chapter3.join_sleep_1;

/**
 * 线程 a 中sleep了6秒，这6秒钟内，线程c 都无法调用threadB的bService方法
 * 可以证明sleep不会释放锁！
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
