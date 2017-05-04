package chapter3.stack_3;

/**
 * @author nickChen
 * @create 2017-04-21 15:40.
 */
public class P_Thread extends Thread {
    private P p;

    public P_Thread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.pushService();
        }
    }
}
