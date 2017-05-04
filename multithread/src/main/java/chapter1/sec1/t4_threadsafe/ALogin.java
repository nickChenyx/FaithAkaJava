package chapter1.sec1.t4_threadsafe;

/**
 * @author nickChen
 * @create 2017-04-19 13:12.
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
