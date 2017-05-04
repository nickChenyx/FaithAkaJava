package chapter1.t8;

/**
 * getId() 获取线程的唯一标识
 * @author nickChen
 * @create 2017-04-19 14:20.
 */
public class Test {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+" "+t.getId());
    }
}
