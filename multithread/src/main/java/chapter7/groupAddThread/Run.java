package chapter7.groupAddThread;

/**
 * 线程组
 *       如何创立线程组
 * @author nickChen
 * @create 2017-04-25 14:48.
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadGroup group = new ThreadGroup("Group");
        Thread at = new Thread(group,a);
        Thread bt = new Thread(group,b);
        at.start();
        bt.start();
        System.out.println("活动的线程数为："+group.activeCount());
        System.out.println("线程组的名称为："+group.getName());
    }

}
