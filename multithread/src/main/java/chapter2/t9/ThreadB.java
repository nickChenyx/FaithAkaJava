package chapter2.t9;

/**
 * @author nickChen
 * @create 2017-04-20 15:50.
 */
public class ThreadB extends Thread {
private MyOneList list;

    public ThreadB(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list,"B");
    }
}
