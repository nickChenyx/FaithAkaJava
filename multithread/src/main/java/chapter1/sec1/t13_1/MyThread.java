package chapter1.sec1.t13_1;

/**
 * 可以通过丢出异常的方式让线程终止！
 * @author nickChen
 * @create 2017-04-19 17:19.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            super.run();
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()){
                    System.out.println("already stopped,exit...");
                    throw new InterruptedException();
                }
                System.out.println("i="+i);
            }
            System.out.println("for循环在上面");
        } catch (InterruptedException e) {
            System.out.println("进 MyThread 类中的run方法的catch了");
            e.printStackTrace();
        }
    }
}
