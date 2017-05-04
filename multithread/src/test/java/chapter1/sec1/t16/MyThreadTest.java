package chapter1.sec1.t16;

import static org.junit.Assert.*;

/**
 * suspend 暂停线程
 * resume  唤醒线程
 * @author nickChen
 * @create 2017-04-19 18:07.
 */
public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(5000);
        //A
        thread.suspend();
        System.out.println("A= "+System.currentTimeMillis()+" i="+thread.getI());
        Thread.sleep(5000);
        System.out.println("A= "+System.currentTimeMillis()+" i="+thread.getI());
        //B
        thread.resume();
        Thread.sleep(5000);
        //C
        thread.suspend();
        System.out.println("B= "+System.currentTimeMillis()+" i="+thread.getI());
        Thread.sleep(5000);
        System.out.println("B= "+System.currentTimeMillis()+" i="+thread.getI());

    }
}
