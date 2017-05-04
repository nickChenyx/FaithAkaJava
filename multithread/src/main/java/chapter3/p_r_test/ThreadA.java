package chapter3.p_r_test;

/**
 * @author nickChen
 * @create 2017-04-21 15:03.
 */
public class ThreadA extends Thread {
    private P p;

    public ThreadA(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.setValue();
        }
    }
}
