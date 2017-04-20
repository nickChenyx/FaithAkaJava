package chapter2.t5;

/**
 * synchronized 同步方法，长时间一个线程占有对象锁，效率较低
 * @author nickChen
 * @create 2017-04-20 13:55.
 */
public class Task {
    private String data1;
    private String data2;
    public synchronized void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            data1 = "长时间运行。。。。返回值1"+Thread.currentThread().getName();
            data2 = "长时间运行。。。。返回值2"+Thread.currentThread().getName();
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("end task");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
