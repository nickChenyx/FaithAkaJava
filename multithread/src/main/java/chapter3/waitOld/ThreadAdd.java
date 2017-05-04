package chapter3.waitOld;

/**
 * @author nickChen
 * @create 2017-04-21 14:46.
 */
public class ThreadAdd extends Thread{
        private Add p ;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
