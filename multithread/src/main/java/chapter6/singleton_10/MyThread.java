package chapter6.singleton_10;

/**
 * @author nickChen
 * @create 2017-04-25 11:03.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // 获取对象的hashcode可以检验对象是否相同
        System.out.println(MyObject.getInstance().hashCode());
    }
}
