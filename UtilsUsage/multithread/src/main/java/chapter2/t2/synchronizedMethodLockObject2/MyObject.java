package chapter2.t2.synchronizedMethodLockObject2;

/**
 * 测试结果可以发现，即使 A线程获得了object的锁（运行methodA方法）
 * 但是 B线程依旧可以访问 object对象中非synchronized方法！
 * @author nickChen
 * @create 2017-04-20 11:30.
 */
public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin method A threadName="+Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println("end");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // synchronized 去掉之后，即使有线程持有对象锁，但是不妨碍访问非 synchronized 对象
    synchronized public void methodB(){
        try {
            System.out.println("begin method B threadName="+Thread.currentThread().getName()+" begin time="+System.currentTimeMillis());
            Thread.sleep(500);
            System.out.println("end");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
