package chapter4.sec1.UseConditionWaitNotifyOk;

/**
 * 成功实现了等待 / 通知模式
 * Object类的 ::  Condition类的
 * wait() :: await()
 * wait(long)  :: await(long,TimeUnit)
 * notify()  ::  signal()
 * notifyAll()  :: signalAll()
 * @author nickChen
 * @create 2017-04-24 10:37.
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        myService.signal();
    }

}
