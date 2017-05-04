package chapter3.wait_notify_size5;

/**
 * @author nickChen
 * @create 2017-04-21 13:27.
 */
public class ThreadB extends Thread {
    private Object lock;

    private MyList list;

    public ThreadB(Object lock, MyList list) {
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                if (list.size()!=5){
                    System.out.println("Thread b above wait");
                    lock.wait();
                    System.out.println("Thread b below wait");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
