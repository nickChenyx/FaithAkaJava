package chapter2.t3.throwExceptionNoLock;

/**
 * 线程代码执行出现异常时，其持有的锁会自动释放！
 * @author nickChen
 * @create 2017-04-20 13:35.
 */
public class Service {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()+" run beginTime="+System.currentTimeMillis());
            int i =1;
            while(i==1){
                if ((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName="+Thread.currentThread().getName()+" run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run time="+System.currentTimeMillis());
        }
    }

}
