package chapter3.p_c_allWait;

/**
 * 出现假死！只需把 P C 类中的notify 改为 notifyAll就可以解决
 * 如果只是notify 有可能 P 只唤醒了另一个 P，C 又只唤醒了另一个 C，这样就假死了
 * @author nickChen
 * @create 2017-04-21 15:13.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        String lock = new String("");
        P p =  new P(lock);
        C c = new C(lock);
        ThreadA[] pt = new ThreadA[2];
        ThreadB[] ct = new ThreadB[2];
        for (int i = 0; i < 2; i++) {
            pt[i] = new ThreadA(p);
            pt[i].setName("Pro."+(i+1));
            ct[i] = new ThreadB(c);
            ct[i].setName("Cos."+(i+1));
            pt[i].start();
            ct[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
        }
    }

}
