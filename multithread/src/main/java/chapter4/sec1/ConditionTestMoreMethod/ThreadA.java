package chapter4.sec1.ConditionTestMoreMethod;

/**
 * @author nickChen
 * @create 2017-04-24 10:29.
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
