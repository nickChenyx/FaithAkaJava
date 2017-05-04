package chapter7.stateTest3;

/**
 * @author nickChen
 * @create 2017-04-25 14:06.
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
      MyService.serviceMethod();
    }
}
