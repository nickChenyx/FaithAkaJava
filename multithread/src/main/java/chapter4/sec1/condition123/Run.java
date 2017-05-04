package chapter4.sec1.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可以使用condition完成顺序执行
 * @author nickChen
 * @create 2017-04-24 14:55.
 */
public class Run {
    volatile private static int nextPrintWho=1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition ca = lock.newCondition();
    final private static Condition cb = lock.newCondition();
    final private static Condition cc = lock.newCondition();

    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while(nextPrintWho!=1){
                        ca.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadA "+i);
                    }
                    nextPrintWho = 2;
                    cb.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while(nextPrintWho!=2){
                        cb.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadB "+i);
                    }
                    nextPrintWho = 3;
                    cc.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while(nextPrintWho!=3){
                        cc.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadC "+i);
                    }
                    nextPrintWho = 1;
                    ca.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        for (int i = 0; i < 3; i++) {
            new Thread(a).start();
            new Thread(b).start();
            new Thread(c).start();
        }
    }


}
