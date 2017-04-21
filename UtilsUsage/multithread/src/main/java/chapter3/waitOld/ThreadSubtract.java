package chapter3.waitOld;

/**
 * @author nickChen
 * @create 2017-04-21 14:47.
 */
public class ThreadSubtract extends  Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
