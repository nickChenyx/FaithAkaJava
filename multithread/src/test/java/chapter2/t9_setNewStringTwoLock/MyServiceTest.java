package chapter2.t9_setNewStringTwoLock;

import static org.junit.Assert.*;

/**
 * 锁的对象发生了改变：从"123"->"456"这是两个不同的对象，所以这时候方法也不是同步的了
 * 但是看到线程C，因为这是时候lock 已经是“456”了，而“456”是在常量池里的，引用不会改变
 * 所以之后的都变成了同步了。
 * @author nickChen
 * @create 2017-04-21 8:49.
 */
public class MyServiceTest {
    public static void main(String[] args) throws InterruptedException{
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadB b = new ThreadB(myService);
        a.setName("A");
        b.setName("B");
        a.start();
//        Thread.sleep(50); // 如果去掉这50ms的睡眠，这有可能线程ab同时抢到“123”，还有可能是同步的
        b.start();
        ThreadA c = new ThreadA(myService);
        c.setName("C");
        c.start();
    }

}