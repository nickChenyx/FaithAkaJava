package chapter2.t2.twoObjectTwoLock;


/**
 * @author nickChen
 * @create 2017-04-20 10:19.
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.add("b");
    }
}
