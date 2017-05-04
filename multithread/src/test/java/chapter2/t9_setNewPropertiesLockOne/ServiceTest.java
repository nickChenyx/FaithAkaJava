package chapter2.t9_setNewPropertiesLockOne;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 9:01.
 */
public class ServiceTest {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA a = new ThreadA(service,userInfo);
            a.setName("A");
            a.start();
            ThreadB b = new ThreadB(service,userInfo);
            b.setName("B");
            b.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}