package chapter2.t5.synchronizedOneThreadIn;

/**
 * synchronized 代码块，执行依旧是同步的
 * @author nickChen
 * @create 2017-04-20 14:10.
 */
public class ObjectService {
    public void serviceMethod(){
        try {
            synchronized (this){
                System.out.println("begin time="+System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end time="+System.currentTimeMillis());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
