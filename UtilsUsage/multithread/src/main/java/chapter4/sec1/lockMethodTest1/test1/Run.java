package chapter4.sec1.lockMethodTest1.test1;

/**
 * 查询当前线程保持此锁定的个数，未被解锁的lock()的次数
 * @author nickChen
 * @create 2017-04-24 11:34.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }

}
