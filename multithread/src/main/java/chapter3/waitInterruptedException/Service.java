package chapter3.waitInterruptedException;

/**
 * 在 wait状态的线程如果被interrupt 则会报 InterruptedException ！
 * @author nickChen
 * @create 2017-04-21 14:20.
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
                System.out.println(" end wait");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现了异常，因为wait状态的线程被interrupt了！");
        }

    }

}
