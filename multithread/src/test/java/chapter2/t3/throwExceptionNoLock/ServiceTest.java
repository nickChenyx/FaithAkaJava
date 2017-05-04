package chapter2.t3.throwExceptionNoLock;

import static org.junit.Assert.*;

/**
 * 线程代码执行出现异常时，其持有的锁会自动释放！
 * B获得对象锁可以打印
 * @author nickChen
 * @create 2017-04-20 13:39.
 */
public class ServiceTest {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            ThreadB b = new ThreadB(service);
            b.setName("b");
            a.start();
            Thread.sleep(100);
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}