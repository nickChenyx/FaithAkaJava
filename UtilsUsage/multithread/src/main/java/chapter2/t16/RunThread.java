package chapter2.t16;

/**
 * isRunning 中有点耗时操作就可以被停止了？ 如果是个空循环体的话，则会进入死循环！
 java version "1.7.0_65"
 Java(TM) SE Runtime Environment (build 1.7.0_65-b19)
 Java HotSpot(TM) 64-Bit Server VM (build 24.65-b04, mixed mode)
 * @author nickChen
 * @create 2017-04-21 10:07.
 */
public class RunThread extends Thread{
    /**
     * 有时候为了效率线程会从私有栈取值，而在Test方法中更改了isRunning的值，更改的是公共堆栈中的值。
     * 加入 volatile 关键字，强制从公共堆栈中进行取值，
     * 可以解决死锁情况。
     */
//    private volatile boolean isRunning = true;
    private boolean isRunning = true;
    public void setRunning(boolean running) {
        isRunning = running;
    }
    @Override
    public void run() {
        System.out.println("进入run方法");
        while(isRunning){
            System.out.println("run() "+isRunning);
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        }
        System.out.println("线程被停止了");
    }
}
