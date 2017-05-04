package chapter2.t8;

/**
 * @author nickChen
 * @create 2017-04-20 14:59.
 */
public class ThreadA extends Thread {
    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
