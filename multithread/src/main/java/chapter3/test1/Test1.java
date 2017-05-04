package chapter3.test1;

/**
 * 对没有获得锁的线程调用对象的wait方法，会触发java.lang.IllegalMonitorStateException
 * @author nickChen
 * @create 2017-04-21 13:39.
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newStr = new String("");
            newStr.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
