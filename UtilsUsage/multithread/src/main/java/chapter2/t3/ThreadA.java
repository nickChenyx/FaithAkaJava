package chapter2.t3;

/**
 * @author nickChen
 * @create 2017-04-20 13:11.
 */
public class ThreadA extends Thread {
    private PublicVar var;

    public ThreadA(PublicVar var) {
        this.var = var;
    }

    @Override
    public void run() {
        var.setValue("B","BB");
    }
}
