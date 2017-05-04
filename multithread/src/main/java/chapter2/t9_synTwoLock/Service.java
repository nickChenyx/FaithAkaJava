package chapter2.t9_synTwoLock;

/**
 * synchronized作用在static方法上是给class上锁
 * class锁可以对一个类的所有实例对象起作用。
 * 对象锁只能作用当前对象
 *
 * synchronized(Service.class) 作用和 synchronized static 是一样的
 * @author nickChen
 * @create 2017-04-20 16:10.
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
            Thread.sleep(1000);
            System.out.println("ThreadName="+Thread.currentThread().getName()+" exit printB at time:"+System.currentTimeMillis());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     synchronized public void printC(){
        try {
            System.out.println("ThreadName="+Thread.currentThread().getName()+" enter printC at time:"+System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("ThreadName="+Thread.currentThread().getName()+" exit printC at time:"+System.currentTimeMillis());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
