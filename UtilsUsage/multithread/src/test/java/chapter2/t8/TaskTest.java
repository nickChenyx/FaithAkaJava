package chapter2.t8;

import static org.junit.Assert.*;

/**
 * 如果 otherMethod 不是synchronized，则运行的结果是异步的
 * 如果 otherMethod 是 synchronized，则运行的结果是同步的，
 * 说明 synchronized(this) 也获取的是当前对象的锁，这样和 synchronized 方法块就形成了竞争，结果变得是同步的
 * @author nickChen
 * @create 2017-04-20 15:00.
 */
public class TaskTest {
    public static void main(String[] args) throws InterruptedException{
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        ThreadB b = new ThreadB(task);
        a.start();
        Thread.sleep(100);
        b.start();
    }

}