package chapter4.sec1.ConditionTestMoreMethod;

/**
 * @author nickChen
 * @create 2017-04-24 10:29.
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
