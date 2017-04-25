package chapter6.singleton_2;

/**
 * @author nickChen
 * @create 2017-04-25 11:15.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){}

    /**
     * 延迟加载 懒汉模式 改进 1
     *
     * 既然是非线程安全，那就给get方法变为同步方法
     * 可是这样效率就很低了，因为是同步方法，所有线程都变得同步了。
     * 但是分析一下，其实只要在创建的时候创建出了 myObject 对象，
     * 后面完全可以异步访问该方法，提高效率
     * @return
     */
    public synchronized static MyObject getInstance(){
        if (myObject != null) {
            return myObject;
        }
        else {
            // 这个延时用来演示该方法是非线程安全的情况！
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;
    }

}
