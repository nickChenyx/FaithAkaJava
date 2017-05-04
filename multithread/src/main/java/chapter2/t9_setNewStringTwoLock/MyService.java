package chapter2.t9_setNewStringTwoLock;

/**
 * 锁的对象发生了改变：从"123"->"456"这是两个不同的对象，所以这时候方法也不是同步的了
 * @author nickChen
 * @create 2017-04-21 8:45.
 */
public class MyService {
    private String lock = "123";
    public void testMethod(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin");
                lock = "456";
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" end");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
