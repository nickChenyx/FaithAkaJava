package chapter4.sec1.MustUseMoreCondition_Ok;

/**
 * 可以看到结果，只有condition-1 中的线程被唤醒了，而condition-2中的还在等待状态！！！
 * 可以唤醒指定的部分的线程，这个非常有用，也是之前的notifyAll做不到的
 * @author nickChen
 * @create 2017-04-24 10:55.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        ThreadA a  = new ThreadA(service);
        a.start();
        ThreadB b  = new ThreadB(service);
        b.start();
        Thread.sleep(2000);
        service.signalAll_1();
    }

}
