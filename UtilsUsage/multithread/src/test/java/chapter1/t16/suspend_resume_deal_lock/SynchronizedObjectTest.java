package chapter1.t16.suspend_resume_deal_lock;

/**
 * @author nickChen
 * @create 2017-04-19 18:15.
 */
public class SynchronizedObjectTest {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread t1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            t1.setName("a");
            t1.start();
            Thread.sleep(1000);
            Thread t2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("t2 启动了，但进入不了printString方法 只打印了一个begin");
                    System.out.println("因为printString（）方法被a线程锁定并且永远suspend暂停了");
                    object.printString();
                }
            };
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}