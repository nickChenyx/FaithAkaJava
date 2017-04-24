package chapter4.sec1.ConditionTestMoreMethod;

/**
 * @author nickChen
 * @create 2017-04-24 10:29.
 */
public class ThreadAA extends Thread {
    private MyService myService;

    public ThreadAA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
