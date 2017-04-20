package chapter2.t8.synBlockString;

/**
 * synchronized() 锁非this对象，这样可以与其他 synchronized 方法异步，不与他们争抢this锁，提高效率
 * @author nickChen
 * @create 2017-04-20 15:17.
 */
public class Service {
    private String username;
    private String password;
//    private String anyStr  = new String(); // 锁定同一个变量才会同步
    public void setUsernamePassword(String u,String p){
        try {
            /**
             * 对象监视器必须要是同一个对象才会形成同步！
             * 这里一定要使用new String（）来构造，这样才能确保两个线程的变量不同。
             * 如果是String anyStr=""; 这样是没用的，还是会同步执行，锁实际上会去查引用地址相同否。
             */
            String anyStr =new String();//这样就导致下面的synchronized锁的是不同对象，这样多个线程都能进来了
            synchronized (anyStr){
                System.out.println("ThreadName="+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步块");
                username = u;
                Thread.sleep(3000);
                password= p;
                System.out.println("ThreadName="+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步块");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
