package chapter4.sec2.ReadWriteLockBegin1;

/**
 * 读锁允许多个线程同时进入！
 * @author nickChen
 * @create 2017-04-24 15:17.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }

}
