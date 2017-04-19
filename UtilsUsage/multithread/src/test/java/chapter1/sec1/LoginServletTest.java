package chapter1.sec1;

import chapter1.sec1.t4_threadsafe.ALogin;
import chapter1.sec1.t4_threadsafe.BLogin;

/**
 * @author nickChen
 * @create 2017-04-19 13:14.
 */
public class LoginServletTest {


    public static void main(String[] args) throws Exception{
        ALogin a = new ALogin();
        BLogin b = new BLogin();
        a.start();
        b.start();
        Thread.sleep(8000);
    }

}