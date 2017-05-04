package chapter7.groupInnerStop;

/**
 * 批量停止线程
 *      在线程组上调用 interrupt() 其中的线程都会执行
 * @author nickChen
 * @create 2017-04-25 15:28.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("T-Group");
            for (int i = 0; i < 5; i++) {
                MyThread thread = new MyThread(group," 线程 "+(i+1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("在 group 上调用了 interrupt() 方法");
        } catch (Exception e) {
            System.out.println("停了！");
            e.printStackTrace();
        }
    }

}
