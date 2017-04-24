package chapter4.sec1.MustUseMoreCondition_Error;

/**
 * 线程 A B 都被唤醒了，如果想单独唤醒部分线程，就可以使用多个condition对象了
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
        service.signalAll();
    }

}
