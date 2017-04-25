package chapter1.t6;

import org.junit.Test;

/**
 * 构造方法是 main 线程调用的
 * start 开启了新的线程 thread-0 运行 run方法
 * @author nickChen
 * @create 2017-04-19 13:37.
 */
public class MyThreadTest {
    @Test
    public void run() throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.run(); // 执行run方法的是main线程
    }

}