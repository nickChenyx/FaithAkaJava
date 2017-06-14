package concurrency;

/**
 * 在 MainThread.java 中运行
 * Created by Administrator on 2017/2/16.
 */
public class LiftOff implements Runnable{ // Runnable 可以定义为可由线程驱动的任务，实现 run 方法即可
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){ this.countDown = countDown; }
    public String status(){
        return "#" + id + "(" + (countDown > 0? countDown : "LiftOff!") + "),";
    }
    public void run() {
        while (countDown-- > 0 ){
            System.out.print(status());
            Thread.yield(); // Java 线程机制的一部分，可以将 CPU 从一个线程转移给另一个线程
        }
    }
}
