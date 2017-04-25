package chapter1.t15;

/**
 * 使用 stop 暴力停止线程，
 * 这是个已经被抛弃的方法
 * @author nickChen
 * @create 2017-04-19 17:34.
 */
public class MyThreadA extends Thread {
    private int i=0;

    @Override
    public void run() {
        try {
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThreadA thread = new MyThreadA();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
