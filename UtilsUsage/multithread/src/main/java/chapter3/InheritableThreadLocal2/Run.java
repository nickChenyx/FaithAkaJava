package chapter3.InheritableThreadLocal2;

import java.util.Date;

/**
 * InheritableThreadLocal 可以在子线程中获取父线程的值
 * @author nickChen
 * @create 2017-04-24 10:09.
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                Tools.tl.set(new Date());
                System.out.println("在线程main中取值："+ Tools.tl.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
