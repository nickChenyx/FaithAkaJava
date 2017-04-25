package chapter1.t16.suspend_resume_deal_lock;

/**
 * suspend resume 会造成共有资源的独占！
 * @author nickChen
 * @create 2017-04-19 18:13.
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a 线程永远 suspend 了");
            Thread.currentThread().suspend();
        }
        System.out.println("end!");
    }

}
