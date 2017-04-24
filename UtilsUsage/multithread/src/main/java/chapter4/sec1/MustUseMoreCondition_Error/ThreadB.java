package chapter4.sec1.MustUseMoreCondition_Error;

/**
 * @author nickChen
 * @create 2017-04-24 10:54.
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
