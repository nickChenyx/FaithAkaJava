package chapter2.t3.synLockIn_1;

/**
 * synchronized 具有锁重入功能，在使用synchronized时，当一个线程获得对象锁时，
 * 再次请求此对象锁时是可以再次获得该对象锁的。也就是说，synchronized 方法/块的内部
 * 调用本类的其他synchronized方法是可以得到对象锁的
 * @author nickChen
 * @create 2017-04-20 13:19.
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service3");
       // service1(); //Exception in thread "Thread-0" java.lang.StackOverflowError
    }

}
