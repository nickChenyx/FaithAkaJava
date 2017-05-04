package chapter3.p_r_test;

/**
 * @author nickChen
 * @create 2017-04-21 15:04.
 */
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadA  pThread = new ThreadA(p);
        ThreadB cThread =new ThreadB(c);
        pThread.start();
        cThread.start();
    }

}
