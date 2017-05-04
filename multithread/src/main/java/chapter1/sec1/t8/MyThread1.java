package chapter1.sec1.t8;

/**
 * @author nickChen
 * @create 2017-04-19 14:12.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName()+" begin.");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin = "+ System.currentTimeMillis());
//        myThread1.run();
        myThread1.start();
        System.out.println("end = "+System.currentTimeMillis());
    }
}
