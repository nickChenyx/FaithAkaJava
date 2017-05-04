package chapter4.sec1.ConditionTestManyToMany;


/**
 * @author nickChen
 * @create 2017-04-24 11:11.
 */
public class ThreadA extends  Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            service.set();
        }
    }
}
