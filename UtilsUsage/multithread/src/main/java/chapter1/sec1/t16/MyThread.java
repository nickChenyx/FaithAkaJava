package chapter1.sec1.t16;

/**
 * @author nickChen
 * @create 2017-04-19 18:06.
 */
public class MyThread extends Thread {
    private long i =0;

    @Override
    public void run() {
        while(true){
            i++;
        }
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}
