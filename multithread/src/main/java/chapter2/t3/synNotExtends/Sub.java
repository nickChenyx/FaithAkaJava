package chapter2.t3.synNotExtends;

/**
 * @author nickChen
 * @create 2017-04-20 13:47.
 */
public class Sub extends Main {
    @Override
    public void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
            super.serviceMethod();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
