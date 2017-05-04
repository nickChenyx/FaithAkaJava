package chapter3.joinTest2;

import static org.junit.Assert.*;

/**
 * join的作用是等待线程对象销毁
 * @author nickChen
 * @create 2017-04-21 16:46.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        try {
            MyThread myThread =new MyThread();
            myThread.start();
            // join() 内部就是当线程isAlive=true时，利用 wait(0) 无限挂起该线程
            myThread.join();
            System.out.println("我想当 mythread 对象执行完成之后，再执行，的确是这样的");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}