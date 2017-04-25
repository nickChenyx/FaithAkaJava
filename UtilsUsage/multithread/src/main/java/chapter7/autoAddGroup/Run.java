package chapter7.autoAddGroup;

/**
 * 线程组自动归属特性
 *      如果实例化一个线程组，自动归属到线程对象所属的线程组
 * @author nickChen
 * @create 2017-04-25 15:03.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("A处线程为："+Thread.currentThread().getName()
                            + " 所属的线程组名为："+Thread.currentThread().getThreadGroup().getName()
                            + " 中的线程组数量："+ Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("new Group");
        System.out.println("B处线程："+Thread.currentThread().getName()
                + " 所属的线程组名为："+Thread.currentThread().getThreadGroup().getName()
                + " 中的线程组数量："+ Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroup);
        for (ThreadGroup p : threadGroup){
            System.out.println("ThreadGroup-"+p.getName());
        }
    }

}
