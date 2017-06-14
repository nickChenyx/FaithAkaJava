package concurrency;

/**
 * 将 Runnable 对象转变为工作任务的传统方式是把它提交给 Thread 构造器
 * Created by Administrator on 2017/2/16.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
