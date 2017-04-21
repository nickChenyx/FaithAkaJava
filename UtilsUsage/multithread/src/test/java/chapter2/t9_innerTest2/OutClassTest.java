package chapter2.t9_innerTest2;

import static org.junit.Assert.*;

/**
 * 如果T3先获得锁，那么T1就要等待了；反之亦然。
 * 可以发现synchronized监视的对象的锁被synchronized获取了。
 * @author nickChen
 * @create 2017-04-20 18:04.
 */
public class OutClassTest {
    public static void main(String[] args) {
        final OutClass.InnerClass1 in1= new OutClass.InnerClass1();
        final OutClass.InnerClass2 in2= new OutClass.InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        },"T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        },"T2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        },"T3");
        t1.start();
        t2.start();
        t3.start();
    }

}