package chapter4.sec1.awaitUntilTest;

/**
 * 说明即使awaitUntil(time);定好了唤醒时间，也是可以被提前唤醒的
 * @author nickChen
 * @create 2017-04-24 14:45.
 */
public class Run2 {
    public static void main(String[] args) throws Exception{
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(2000);
        ThreadB b = new ThreadB(service);
        b.start();
    }

}
