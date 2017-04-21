package chapter2.t16_synchronizedUpdateNewValue;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-21 11:41.
 */
public class ServiceTest {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);
            a.start();
            Thread.sleep(1000);
            b.start();
            System.out.println("已经发起停止指令！");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}