package chapter3.stack_1;

/**
 * 1对1 的生产者与消费者模型
 * @author nickChen
 * @create 2017-04-21 15:41.
 */
public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        P_Thread p_thread= new P_Thread(p);
        C_Thread c_thread = new C_Thread(c);
        p_thread.start();
        c_thread.start();
    }

}
