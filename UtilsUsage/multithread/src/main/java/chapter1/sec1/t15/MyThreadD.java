package chapter1.sec1.t15;

/**
 * return 也能终止线程运行，但是通过catch方式可以将线程停止的信息传播到异常上
 * @author nickChen
 * @create 2017-04-19 18:02.
 */
public class MyThreadD extends Thread {
    @Override
    public void run() {
        while(true){
            if (this.isInterrupted()){
                System.out.println("中断。。。");
                return;
            }
            System.out.println("timer = "+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws Exception{
        MyThreadD thread = new MyThreadD();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
