package chapter4.sec1.awaitUntilTest;

/**
 * 说明 线程A 可以在 awaitUntil(10s); 10秒内唤醒自己！
 * @author nickChen
 * @create 2017-04-24 14:44.
 */
public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
    }

}
