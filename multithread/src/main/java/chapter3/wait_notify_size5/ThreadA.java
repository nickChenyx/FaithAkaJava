package chapter3.wait_notify_size5;

/**
 * @author nickChen
 * @create 2017-04-21 13:26.
 */
public class ThreadA extends Thread {
    private Object lock;
    private MyList list;

    public ThreadA(Object lock, MyList list) {
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    list.add();
                    System.out.println("add "+(i+1)+" times");
                    Thread.sleep(1000);
                    if (list.size()==5){
                        System.out.println("Thread a above notify");
                        lock.notify();
                        System.out.println("Thread a below notify");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
