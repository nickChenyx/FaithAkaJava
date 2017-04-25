package chapter1.t7;

/**
 * @author nickChen
 * @create 2017-04-19 13:46.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }

    public static void main(String[] args)throws Exception {
        MyThread myThread = new MyThread();
        System.out.println("begin == "+myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end == " +myThread.isAlive());

    }
}
