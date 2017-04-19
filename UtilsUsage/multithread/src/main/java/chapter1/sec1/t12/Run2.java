package chapter1.sec1.t12;

/**
 * 使 main 线程产生中断效果
 * Thread.interrupted()会清除为true的中断状态！
 * @author nickChen
 * @create 2017-04-19 14:32.
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt(); // 可以中断 main 线程
        System.out.println("Stop 1? ="+Thread.interrupted());//true // 线程的中断状态由该方法清除!!!
        System.out.println("Stop 2? ="+Thread.interrupted());//false
    }
}
