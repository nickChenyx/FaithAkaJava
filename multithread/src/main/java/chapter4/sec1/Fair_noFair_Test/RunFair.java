package chapter4.sec1.Fair_noFair_Test;

/**
 * FIFO 原则 运行基本有序
 * @author nickChen
 * @create 2017-04-24 11:28.
 */
public class RunFair {
    public static void main(String[] args) throws Exception{
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("*Thread: "+Thread.currentThread().getName()+" is running");
                service.serviceMethod();
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
