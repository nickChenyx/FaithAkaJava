package chapter2.t3;

import static org.junit.Assert.*;

/**
 * 数据出现了脏读现象，共享变量在操作的时候被别的线程读取了。
 * @author nickChen
 * @create 2017-04-20 13:13.
 */
public class PublicVarTest {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA a = new ThreadA(publicVar);
            a.start();
            Thread.sleep(10);
            publicVar.getValue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}