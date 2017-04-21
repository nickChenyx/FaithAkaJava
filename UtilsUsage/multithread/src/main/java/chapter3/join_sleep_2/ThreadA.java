package chapter3.join_sleep_2;

/**
 * @author nickChen
 * @create 2017-04-21 17:12.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                b.start();
                b.join();
                System.out.println("b join finish");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
