package chapter2.t9_setNewStringTwoLock;

/**
 * @author nickChen
 * @create 2017-04-21 8:48.
 */
public class ThreadA extends Thread{
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
