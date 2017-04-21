package chapter3.TwoThreadTransData;

import static org.junit.Assert.*;

/**
 * list 必须设置为volatile，不然线程之间看不到，可能是jdk版本问题，和书上说的不一样
 * 线程B通过不断轮询list的size来抛出异常终端线程！浪费资源
 * @author nickChen
 * @create 2017-04-21 13:29.
 */
public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        ThreadB b = new ThreadB(list);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();

    }

}