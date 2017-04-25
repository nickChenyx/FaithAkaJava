package chapter1.t19;

/**
 * 逻辑上应该是优先级高的先执行完，只是我电脑上看到的是差不多交叉执行的，没有看出优先级带来的影响
 * @author nickChen
 * @create 2017-04-20 9:30.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            MyThread1 t1 = new MyThread1();
            t1.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            MyThread2 t2 = new MyThread2();
            t2.setPriority(Thread.MIN_PRIORITY);
            t2.start();
        }
    }

}