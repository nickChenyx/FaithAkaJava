package chapter1.sec1;

/**
 * 和 MyThreadC 比，设置了同步方法，不会出现对count的错误操作
 * @author nickChen
 * @create 2017-04-19 13:07.
 */
public class MyThreadD extends Thread {
    private int count = 10;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(this.currentThread().getName()+" is working : count = "+count);
    }
}
