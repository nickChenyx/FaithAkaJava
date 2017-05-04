package chapter3.test1;

/**
 * wait 将线程挂起，之后的程序不会运行了。
 * @author nickChen
 * @create 2017-04-21 13:42.
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("above syn");
            synchronized (lock){
                System.out.println("syn line 1:...");
                lock.wait();
                System.out.println("syn line 3:...");
            }
            System.out.println("below syn");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
