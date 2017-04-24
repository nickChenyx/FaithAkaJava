package chapter4.sec1.z3_ok;

/**
 * 只打印了字母 A
 * 原因是调用了 condition的await方法，当前线程进入了等待状态
 * @author nickChen
 * @create 2017-04-24 10:37.
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
    }

}
