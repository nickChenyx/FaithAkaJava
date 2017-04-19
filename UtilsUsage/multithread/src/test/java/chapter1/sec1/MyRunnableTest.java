package chapter1.sec1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * 1. 这样的使用方式和MyThread没有区别，只是通过接口的方式实现更加灵活
 * 2. Runnable 的运行方式也是通过 Thread 入构造参数实现
 * @author nickChen
 * @create 2017-04-19 11:45.
 */
public class MyRunnableTest {
    @org.junit.Test
    public void testRun(){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("over!!!");
    }
}