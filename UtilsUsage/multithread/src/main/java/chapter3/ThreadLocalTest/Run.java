package chapter3.ThreadLocalTest;

import java.util.Date;

/**
 * 验证 ThreadLocal 线程变量的隔离性
 * 可以得到，ThreadLocal set的变量值在当前线程内有效
 * @author nickChen
 * @create 2017-04-24 9:53.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 10; i++) {
                Tools.tl.set(new Date());
                System.out.println("Main get Value="+Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
