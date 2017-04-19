package chapter1.sec1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * 共享的变量没有锁，导致结果和预期不同
 * 原因：
 * JVM中的操作
 * 1. 取得 count 的值
 * 2. 计算 count-1
 * 3. 对 count 赋值
 * （实际上 JVM 优化之后会2 3 一起做，将2计算的出来的值放入固定的地址，count指向那个地址，不同步，速度快，但是有风险，
 *  count的操作不具有原子性了，需要配合 volatile）
 * @author nickChen
 * @create 2017-04-19 12:59.
 */
public class MyThreadCTest {

    /**
     1 is working : count = 8
     5 is working : count = 7
     3 is working : count = 8 // 出现了错误
     7 is working : count = 6
     0 is working : count = 5
     * @throws Exception
     */
    @org.junit.Test
    public void run() throws Exception {
        MyThreadC myThreadC = new MyThreadC();
        for (int i = 0; i < 10; i++) {
            new Thread(myThreadC,String.valueOf(i)).start();
        }
        Thread.sleep(1000);
    }

}