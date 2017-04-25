package chapter7.groupInnerStop;

/**
 * @author nickChen
 * @create 2017-04-25 15:26.
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group,String name){
        super(group,name);
    }

    @Override
    public void run() {
        System.out.println("Thread-"+Thread.currentThread().getName()+ " 准备开始死循环了");
        while(!this.isInterrupted()){

        }
        System.out.println("Thread-"+Thread.currentThread().getName()+ " 结束循环了");
    }
}
