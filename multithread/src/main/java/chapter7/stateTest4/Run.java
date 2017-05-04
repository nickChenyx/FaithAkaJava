package chapter7.stateTest4;

/**
 * @author nickChen
 * @create 2017-04-25 14:44.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            // 这时候的状态是 WAITING 被 wait() 挂起了
            System.out.println("main t state: "+t.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
