package chapter4.sec1.Fair_noFair_Test;

/**
 * 抢占式 先后顺序混乱
 * @author nickChen
 * @create 2017-04-24 11:31.
 */
public class RunNotFair {
    public static void main(String[] args) throws Exception{
        final Service service = new Service(false);
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
