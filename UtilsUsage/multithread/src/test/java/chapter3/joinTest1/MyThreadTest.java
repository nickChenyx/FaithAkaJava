package chapter3.joinTest1;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 16:42.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.start();
//        Thread.sleep(?);
        System.out.println("我想当mythread对象执行完毕后我再执行");
        System.out.println("但上面代码的sleep应该写多久呢？");
        System.out.println("很明显这不能确定");
    }

}