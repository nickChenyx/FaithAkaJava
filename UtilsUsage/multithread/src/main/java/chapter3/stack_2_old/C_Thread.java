package chapter3.stack_2_old;

/**
 * @author nickChen
 * @create 2017-04-21 15:40.
 */
public class C_Thread extends Thread{
    private C c;

    public C_Thread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.popService();
        }
    }
}
