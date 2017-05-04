package chapter3.p_c_allWait;


/**
 * @author nickChen
 * @create 2017-04-21 15:04.
 */
public class ThreadB extends Thread {
    private C c;

    public ThreadB(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            c.getValue();
        }
    }
}
