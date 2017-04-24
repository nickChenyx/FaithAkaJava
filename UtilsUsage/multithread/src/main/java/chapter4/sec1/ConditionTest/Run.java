package chapter4.sec1.ConditionTest;

/**
 * 生产 / 消费模式，一对一交替打印
 * @author nickChen
 * @create 2017-04-24 11:11.
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        ThreadB b = new ThreadB(myService);
        b.start();
    }

}
