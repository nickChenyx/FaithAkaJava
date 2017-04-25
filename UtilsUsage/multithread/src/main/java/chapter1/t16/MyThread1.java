package chapter1.t16;

/**
 * @author nickChen
 * @create 2017-04-19 18:21.
 */
public class MyThread1 extends Thread {
private long i = 0;

    /**
     * 若是去掉了sout这一句，测试类中会输出main end!
     * 可是加上了这一句的话 main end！是永远不会输出的。
     * println() 方法代码是这样的，
     *  public void println(long x) {
                synchronized (this) {
                 print(x);
                 newLine();
            }
          }
     * 因为MyThread1 一直抢占着println的锁，从而主线程打印main end！不能进入
     */
    @Override
    public void run() {
        while(true){
            i++;
            System.out.println(i);
        }
    }
}
