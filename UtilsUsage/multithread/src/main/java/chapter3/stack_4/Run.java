package chapter3.stack_4;

/**
 * 多生产者多消费者情况
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
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        P_Thread p_thread= new P_Thread(p);
        P_Thread p_thread1= new P_Thread(p1);
        P_Thread p_thread2= new P_Thread(p2);
        P_Thread p_thread3= new P_Thread(p3);
        C_Thread c_thread1 = new C_Thread(c1);
        C_Thread c_thread2 = new C_Thread(c2);
        C_Thread c_thread3 = new C_Thread(c3);
        C_Thread c_thread4 = new C_Thread(c4);
        C_Thread c_thread5 = new C_Thread(c5);
        p_thread.start();
        p_thread1.start();
        p_thread2.start();
        p_thread3.start();
        c_thread1.start();
        c_thread2.start();
        c_thread3.start();
        c_thread4.start();
        c_thread5.start();
    }

}
