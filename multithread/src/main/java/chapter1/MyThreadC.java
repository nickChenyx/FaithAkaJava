package chapter1;

/**
 * @author nickChen
 * @create 2017-04-19 12:58.
 */
public class MyThreadC extends  Thread {
    private int count = 10;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println(this.currentThread().getName()+" is working : count = "+count);
    }
}
