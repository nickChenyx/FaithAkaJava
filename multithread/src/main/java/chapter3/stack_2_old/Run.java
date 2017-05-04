package chapter3.stack_2_old;

/**
 * 从stack_1中拉过来直接添加多个消费者，出现java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
 * 一个生产者多个消费者
 * @author nickChen
 * @create 2017-04-21 15:41.
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);

        P_Thread p_thread= new P_Thread(p);
        C_Thread c_thread1 = new C_Thread(c1);
        C_Thread c_thread2 = new C_Thread(c2);
        C_Thread c_thread3 = new C_Thread(c3);
        C_Thread c_thread4 = new C_Thread(c4);
        C_Thread c_thread5 = new C_Thread(c5);
        p_thread.start();
        c_thread1.start();
        c_thread2.start();
        c_thread3.start();
        c_thread4.start();
        c_thread5.start();
    }

}
