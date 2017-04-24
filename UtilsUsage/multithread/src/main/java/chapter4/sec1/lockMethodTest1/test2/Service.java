package chapter4.sec1.lockMethodTest1.test2;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @author nickChen
 * @create 2017-04-24 11:39.
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try{
            lock.lock();
            System.out.println("ThreadName: "+Thread.currentThread().getName()+" enter serviceMethod-1!");
            Thread.sleep(6000);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
