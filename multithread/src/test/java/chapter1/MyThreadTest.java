package chapter1;

import org.junit.Test;

/**
 * 1. 执行结果与调用顺序无关
 * 2. 多次调用start 会产生 java.lang.IllegalThreadStateException 异常
 * @author nickChen
 * @create 2017-04-19 11:24.
 */

public class MyThreadTest {
    @Test
    public void testRun(){
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.start();
        System.out.println("over!!!");
    }

}