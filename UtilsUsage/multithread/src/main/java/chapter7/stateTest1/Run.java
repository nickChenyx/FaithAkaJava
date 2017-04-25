package chapter7.stateTest1;

/**
 *
 *
 构造方法中的状态：RUNNABLE  // 这个在构造方法中调用的实际上显示的是 main线程的状态
 main 1:NEW
 run 方法中的状态：RUNNABLE
 main 2:TERMINATED
 * @author nickChen
 * @create 2017-04-25 14:07.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread= new MyThread();
            System.out.println("main 1:"+ thread.getState());
            Thread.sleep(1000);
            thread.start();
            Thread.sleep(1000);
            System.out.println("main 2:"+ thread.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
