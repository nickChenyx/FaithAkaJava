package chapter2.t7.doubleSynBlockOneTwo;

/**
 * synchronized 代码块同样会获取对象锁，当一个线程进入synchronized代码块中，
 * 其他线程就不能进入该类其他synchronized代码块中，一直是同步进行！
 * @author nickChen
 * @create 2017-04-20 14:47.
 */
public class ObjectService {
    public void serviceMethodA(){
        try {
            synchronized (this){
                System.out.println("A begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end   time="+System.currentTimeMillis());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time="+System.currentTimeMillis());
            System.out.println("B end   time="+System.currentTimeMillis());
        }
    }

}
