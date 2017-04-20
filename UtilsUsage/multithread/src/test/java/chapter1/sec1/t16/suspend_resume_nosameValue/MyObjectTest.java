package chapter1.sec1.t16.suspend_resume_nosameValue;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 9:09.
 */
public class MyObjectTest {
    public static void main(String[] args) throws InterruptedException{
        final MyObject object = new MyObject();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                object.setValue("a","aa");
            }
        };
        t1.setName("a");
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(){
            @Override
            public void run() {
                object.printUsernamePassword();
            }
        };
        t2.start();
    }
}