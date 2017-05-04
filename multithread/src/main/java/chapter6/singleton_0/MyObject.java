package chapter6.singleton_0;

/**
 * @author nickChen
 * @create 2017-04-25 11:01.
 */
public class MyObject {
    private static MyObject myObject = new MyObject();
    // 声明了静态变量，先被初始化为0；还未赋值为1，上面一条语句先执行，打印出了初始值0
    private static int i = 1;
    private MyObject(){
        System.out.println("i="+i);
    }

    /**
     * 立即加载 饿汉模式
     * 在调用方法前就完成了实例化，实例化的过程是安全的。
     * 但是 getInstance 方法并没有同步，所有getInstance中不能做操作，是非线程安全的！
     *
     * 所以这个方式的有点是简洁，代码量少；
     * 但是这个方法局限性很大，能获取的
     * @return
     */
    public static MyObject getInstance(){
        System.out.println(i++);// 这个操作就是非线程安全的了
        return myObject;
    }
}
