package chapter3.stack_3;

/**
 * 多生产者 一消费者
 * @author nickChen
 * @create 2017-04-21 15:41.
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        C c1 = new C(myStack);
        P_Thread p_thread= new P_Thread(p);
        P_Thread p_thread1= new P_Thread(p1);
        P_Thread p_thread2= new P_Thread(p2);
        P_Thread p_thread3= new P_Thread(p3);
        C_Thread c_thread1 = new C_Thread(c1);
        p_thread.start();
        p_thread1.start();
        p_thread2.start();
        p_thread3.start();
        c_thread1.start();

    }

}
