package chapter4.sec1.UseConditionWaitNotifyOk;

/**
 * @author nickChen
 * @create 2017-04-24 10:36.
 */
public class ThreadA extends  Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
