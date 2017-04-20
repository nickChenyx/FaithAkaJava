package chapter2.t3.synLockIn_2;

/**
 * @author nickChen
 * @create 2017-04-20 13:26.
 */
public class Main {
    public int i=10;
    synchronized public void operateIMainMethod(){
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
