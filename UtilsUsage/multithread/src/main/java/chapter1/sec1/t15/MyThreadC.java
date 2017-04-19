package chapter1.sec1.t15;

/**
 * 结果为：b aa
 * 可以看出 stop停止了方法之后，即使是声明了 synchronized 的方法也不能保证数据正确
 * @author nickChen
 * @create 2017-04-19 17:56.
 */
public class MyThreadC extends Thread {
    private SynchronizedObject object;

    public MyThreadC(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }

    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThreadC thread = new MyThreadC(object);
            thread.start();
            Thread.sleep(1000);
            thread.stop();
            System.out.println(object.getUsername()+" "+object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
