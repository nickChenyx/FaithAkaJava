package chapter3.joinMoreTest;

/**
 * @author nickChen
 * @create 2017-04-21 17:24.
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("   main end time="+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
