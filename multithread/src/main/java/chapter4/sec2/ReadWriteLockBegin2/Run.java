package chapter4.sec2.ReadWriteLockBegin2;

/**
 * 写锁互斥，写写不能同时进行！！
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
