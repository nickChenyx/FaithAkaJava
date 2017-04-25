package chapter7.stateTest3;

/**
 *

 * @author nickChen
 * @create 2017-04-25 14:07.
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("A");
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyThread1 thread2 = new MyThread1();
        thread2.setName("B");
        // 还没 start 的线程状态是 NEW
        System.out.println("main thread-2: "+thread2.getState());
        thread2.start();
        // 这时候拿到的还是 RUNNABLE 但其实这时候锁已经被线程 A 拿走了，应该是BLOCKED 所以延时再看看state
        // getState 设计也是为了监控状态，而非同步控制，可能是不是很准
        System.out.println("main thread-2: "+thread2.getState());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 这时候的状态是 BLOCKED，在等待锁的释放
        System.out.println("main thread-2: "+thread2.getState());
    }

}
