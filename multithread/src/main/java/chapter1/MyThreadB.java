package chapter1;

/**
 * @author nickChen
 * @create 2017-04-19 11:38.
 */
public class MyThreadB extends Thread {
    private int i;
    public MyThreadB(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(i);
    }
}
