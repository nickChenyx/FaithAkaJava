package chapter2.t2.synchronizedMethodLockObject;

/**
 * synchronized 同步了对象，使得线程顺序进入方法，顺序运行。
 * @author nickChen
 * @create 2017-04-20 10:54.
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

}
