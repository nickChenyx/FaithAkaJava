package chapter2.t9_setNewStringTwoLock;

/**
 * @author nickChen
 * @create 2017-04-21 8:48.
 */
public class ThreadB extends Thread{
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
