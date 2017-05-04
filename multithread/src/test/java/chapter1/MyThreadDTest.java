package chapter1;

/**
 * @author nickChen
 * @create 2017-04-19 13:08.
 */
public class MyThreadDTest {
    @org.junit.Test
    public void run() throws Exception {
        MyThreadC myThreadC = new MyThreadC();
        for (int i = 0; i < 10; i++) {
            new Thread(myThreadC,String.valueOf(i)).start();
        }
        Thread.sleep(1000);
    }

}