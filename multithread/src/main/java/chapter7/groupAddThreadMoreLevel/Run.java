package chapter7.groupAddThreadMoreLevel;

/**
 * 多级关联的线程组
 *         如何构建
 *
 * @author nickChen
 * @create 2017-04-25 14:53.
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup,"A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread newThread = new Thread(group,runnable);
        newThread.setName("Z");
        newThread.start(); // 线程必须启动后才会归入 A 组

        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];

        /**
         * Copies into the specified array references to every active
         * subgroup in this thread group and its subgroups.
         */
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("Thread main has sub threads: "+listGroup.length+" name: "+ listGroup[0].getName());
        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());
    }


}
