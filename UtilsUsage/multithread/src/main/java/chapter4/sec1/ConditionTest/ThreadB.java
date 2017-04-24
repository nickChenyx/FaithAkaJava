package chapter4.sec1.ConditionTest;

/**
 * @author nickChen
 * @create 2017-04-24 11:11.
 */
public class ThreadB extends  Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            service.get();
        }
    }
}
