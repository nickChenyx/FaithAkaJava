package chapter3.notifyAll;

import static org.junit.Assert.*;

/**
 *  一个notify 只能随机唤醒一个 wait阻塞的线程！多个notify可以唤醒多个wait阻塞的线程
 *  想要唤醒全部被wait的线程，可以通过 notifyAll
 * @author nickChen
 * @create 2017-04-21 14:30.
 */
public class ServiceTest {
    public static void main(String[] args) throws InterruptedException{
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
//        NotifyThread notifyThread = new NotifyThread(lock);
//        notifyThread.start();
        synchronized (lock){
            lock.notifyAll();
        }
    }

}