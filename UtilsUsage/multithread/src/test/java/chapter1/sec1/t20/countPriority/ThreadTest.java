package chapter1.sec1.t20.countPriority;

import static org.junit.Assert.*;

/**
 * 结果可以看出，大部分情况下，优先级高的运算出来的更多。（这都是假的...
 * 结果可以看出 优先级对结果影响不大！（可以说是没有
 * java version "1.7.0_65"
 * Java(TM) SE Runtime Environment (build 1.7.0_65-b19)
 * Java HotSpot(TM) 64-Bit Server VM (build 24.65-b04, mixed mode)
 * @author nickChen
 * @create 2017-04-20 9:40.
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException{
        ThreadA a = new ThreadA();
        a.setPriority(10);
        a.start();
        ThreadB b = new ThreadB();
        b.setPriority(1);
        b.start();
        Thread.sleep(2000);
        a.stop();
        b.stop();
        System.out.println("a="+a.getCount());
        System.out.println("b="+b.getCount());
        /*
        a=1055231348
        b=876800529
        * */
    }
}