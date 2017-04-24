package chapter4.sec1.UseConditionWaitNotifyError;

/**
 * 抛出 java.lang.IllegalMonitorStateException
 * 获取监视器错误，因为在调用之前并未获取监视器
 * lock.lock() 实际上就获取了对象监视器
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
