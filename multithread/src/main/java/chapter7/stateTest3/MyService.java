package chapter7.stateTest3;

/**
 * @author nickChen
 * @create 2017-04-25 14:32.
 */
public class MyService {
    synchronized static public void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName()+" enter serviceMethod()");
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
