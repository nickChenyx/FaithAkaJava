package chapter2.t8.syn_Out_asyn;

import static org.junit.Assert.*;

/**
 * 同步方法内的执行是同步的，但是线程 a 和b的执行是异步的，这样可能出现脏读的情况 t9会重现这个情况
 * @author nickChen
 * @create 2017-04-20 15:41.
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