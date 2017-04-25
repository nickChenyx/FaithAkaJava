package chapter1.t6;

/**
 * @author nickChen
 * @create 2017-04-19 13:40.
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate -- begin");
        System.out.println("ThreadName: "+Thread.currentThread().getName());// 获取当前在操作的线程名
        System.out.println("this.getName: "+this.getName());// 始终获取默认分配的线程名
        System.out.println("CountOperate -- end");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run -- begin");
        System.out.println("ThreadName: "+Thread.currentThread().getName());
        System.out.println("this.getName: "+this.getName());
        System.out.println("run -- end");
    }
}
