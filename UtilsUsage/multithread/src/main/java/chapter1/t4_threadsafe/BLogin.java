package chapter1.t4_threadsafe;

/**
 * @author nickChen
 * @create 2017-04-19 13:13.
 */
public class BLogin extends Thread  {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
