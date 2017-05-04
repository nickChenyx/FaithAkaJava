package chapter6.singleton_7;

/**
 * @author nickChen
 * @create 2017-04-25 11:15.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){}
    /**
     * 使用静态内部类的方式来实现单例模式，这是线程安全的，类在第一次被引用的时候就完成了加载过程
     * @return
     */
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

}
