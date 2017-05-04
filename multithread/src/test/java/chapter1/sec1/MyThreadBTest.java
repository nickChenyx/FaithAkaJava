package chapter1.sec1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * 执行start方法的顺序不代表线程启动的顺序，最后输出的结果不是顺序的0-9
 * @author nickChen
 * @create 2017-04-19 11:39.
 */
public class MyThreadBTest {
    /**
     * 使用JUnit 线程会有问题，不会打印完10个数字就退出了，所有有了下面的main方法
     */
    @org.junit.Test
    public void testRun(){
        for (int i = 0; i < 10; i++) {
            new MyThreadB(i).start();
        }
    }

    /**
     * 可以答应出全部的线程输出
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThreadB(i).start();
        }
    }
}