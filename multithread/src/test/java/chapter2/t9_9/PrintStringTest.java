package chapter2.t9_9;

/**
 * 可以发现这里直接进入了printStringMethod的while循环，死循环了，顺序执行的后面两个语句根本没有得到执行。
 * 想要停下来依靠多线程了
 * @author nickChen
 * @create 2017-04-21 9:10.
 */
public class PrintStringTest {
    public static void main(String[] args) {
        PrintString ps = new PrintString();
        ps.printStringMethod();
        System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
        ps.setContinuePrint(false);
    }

}