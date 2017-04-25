package chapter7.getGroupParent;

/**
 * main线程组的父线程是system，在之上就没有了
 * @author nickChen
 * @create 2017-04-25 15:15.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Thread-"+ Thread.currentThread().getName()
                                +" 所在的线程组名为："+ Thread.currentThread().getThreadGroup().getName());
        System.out.println("main 线程所在的线程组的父线程组名为："+
                                        Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("main 线程所在的线程组的父线程组的父线程组名为："+
                        Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }

}
