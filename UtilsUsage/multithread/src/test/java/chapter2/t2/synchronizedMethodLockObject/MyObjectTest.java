package chapter2.t2.synchronizedMethodLockObject;

import static org.junit.Assert.*;

/**
 * synchronized 同步了对象，使得线程顺序进入方法，顺序运行。
 * @author nickChen
 * @create 2017-04-20 11:12.
 */
/*
如果 methodA 不同步
begin method A threadName=A
begin method A threadName=B
end
end
如果 methodA 同步
begin method A threadName=A
end
begin method A threadName=B
end
 */
public class MyObjectTest {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}