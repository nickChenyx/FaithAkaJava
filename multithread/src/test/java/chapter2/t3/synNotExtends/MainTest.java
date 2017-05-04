package chapter2.t3.synNotExtends;

import static org.junit.Assert.*;

/**
 *  同步是不能继承的，必须要添加synchronized 关键字，
 *  总结一下 synchronized 方法可以实现可重入锁，在继承结构中可以获得父类的对象锁
 *  synchronized 不能被继承，子类必须自己声明 synchronized
 * @author nickChen
 * @create 2017-04-20 13:49.
 */
public class MainTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA a = new ThreadA(sub);
        ThreadB b = new ThreadB(sub);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}