package chapter7.stateTest2;

/**
 *
 begin sleep
 main :TIMED_WAITING   // MyThread 进入 TIMED_WAITING 状态，有等待时间的进入这个状态
 end sleep
 * @author nickChen
 * @create 2017-04-25 14:07.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread= new MyThread();
            thread.start();
            Thread.sleep(1000);
            System.out.println("main :"+ thread.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
