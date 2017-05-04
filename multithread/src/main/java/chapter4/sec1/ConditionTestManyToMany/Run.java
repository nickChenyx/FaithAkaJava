package chapter4.sec1.ConditionTestManyToMany;

/**
 * 生产 / 消费模式，多对多打印
 * 出现假死情况，因为 service里只是用了signal，可能造成生产者只唤醒了生产者，产生这样的假死
 * 只需要改成signalAll就可以了，但是可以发现出现了多次连续打印，这样浪费了唤醒的机会了。
 * @author nickChen
 * @create 2017-04-24 11:11.
 */
public class Run {
    public static void main(String[] args) {
       MyService myService = new MyService();
        for (int i = 0; i < 10; i++) {
            new ThreadA(myService).start();
            new ThreadB(myService).start();
        }
    }

}
