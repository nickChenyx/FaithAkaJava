package chapter2.t8;

/**
 *
 * @author nickChen
 * @create 2017-04-20 14:54.
 */
public class Task  {
    //synchronized
    public  void otherMethod(){
        System.out.println("--------------------run--otherMethod");
    }
    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+i);
            }
        }
    }

}
