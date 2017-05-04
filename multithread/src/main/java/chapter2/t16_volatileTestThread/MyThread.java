package chapter2.t16_volatileTestThread;

/**
 * 证明 volatile 不具有原子性
 * @author nickChen
 * @create 2017-04-21 11:08.
 */
public class MyThread extends Thread {
    volatile public static int count;

    /**
     * 加了synchronized 关键字 并且有 static关键字，
     * synchronized  static 对class上锁，就对所有实例都实行同步操作！这样数据的原子性就得到了保证
     */
    //private synchronized  static void addCount(){
    private  static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
