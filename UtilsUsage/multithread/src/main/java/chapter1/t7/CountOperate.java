package chapter1.t7;

/**
 * @author nickChen
 * @create 2017-04-19 13:50.
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate -- begin");
        System.out.println("ThreadName: "+Thread.currentThread().getName());// 获取当前在操作的线程名
        System.out.println("ThreadAlive:" + Thread.currentThread().isAlive());
        System.out.println("this.getName: "+this.getName());// 始终获取默认分配的线程名
        System.out.println("this.isAlive:"+this.isAlive());
        System.out.println("CountOperate -- end");
    }

    @Override
    public void run() {
        System.out.println("run -- begin");
        System.out.println("ThreadName: "+Thread.currentThread().getName());// 获取当前在操作的线程名
        System.out.println("ThreadAlive:" + Thread.currentThread().isAlive());
        System.out.println("this.getName: "+this.getName());// 始终获取默认分配的线程名
        System.out.println("this.isAlive:"+this.isAlive());
        System.out.println("run -- end");
    }
}
