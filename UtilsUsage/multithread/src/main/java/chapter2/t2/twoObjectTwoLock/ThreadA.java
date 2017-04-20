package chapter2.t2.twoObjectTwoLock;


/**
 * @author nickChen
 * @create 2017-04-20 10:19.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.add("a");
    }
}
