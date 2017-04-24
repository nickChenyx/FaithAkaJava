package chapter4.sec1.ReentrantLockTest;

/**
 * @author nickChen
 * @create 2017-04-24 10:20.
 */
public class MyThread extends  Thread {
    private MyService myService = new MyService();

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
