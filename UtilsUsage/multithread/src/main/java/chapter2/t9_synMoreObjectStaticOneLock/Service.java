package chapter2.t9_synMoreObjectStaticOneLock;

/**
 * Class锁将会对所有实例生效！
 * @author nickChen
 * @create 2017-04-20 16:23.
 */
public class Service {
    synchronized public static void printA(){
        try {
            System.out.println("ThreadName="+Thread.currentThread().getName()+" enter printA at time:"+System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("ThreadName="+Thread.currentThread().getName()+" exit printA at time:"+System.currentTimeMillis());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    synchronized public static void printB(){
        try {
            System.out.println("ThreadName="+Thread.currentThread().getName()+" enter printB at time:"+System.currentTimeMillis());
            System.out.println("ThreadName="+Thread.currentThread().getName()+" exit printB at time:"+System.currentTimeMillis());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
