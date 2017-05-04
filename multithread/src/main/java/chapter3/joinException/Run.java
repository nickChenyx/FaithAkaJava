package chapter3.joinException;

/**
 * 本例子说明  join() 和 interrupt() 遇到会出现 java.lang.InterruptedException 异常，
 * 但是进程还在运行，线程A、并未出现异常，还在正常运行
 * @author nickChen
 * @create 2017-04-21 17:00.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
            System.out.println("main end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
