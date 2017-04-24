package chapter4.sec1.ConditionTestMoreMethod;

/**
 * 线程之间是同步的！
 *
 * @author nickChen
 * @create 2017-04-24 10:30.
 */
public class Run {
    public static void main(String[] args)  throws  Exception{
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();
    }

}
