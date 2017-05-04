package chapter1.sec1.t18;

/**
 * 线程有优先级之分，1-10级
 * 通常只用三级 MIN NORM MAX
 * 线程的优先级是可以继承的，被启动的线程 会继承 启动它的线程 的优先级等级
 * @author nickChen
 * @create 2017-04-20 9:20.
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }

    public static void main(String[] args) {
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6); // 优先级可以被继承
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());
        MyThread1 t1= new MyThread1();
        t1.start();
    }
}
