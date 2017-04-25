package chapter6.singleton_1;

/**
 * @author nickChen
 * @create 2017-04-25 11:15.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){}

    /**
     * 延迟加载 懒汉模式
     * 在调用get方法的时候才创建实例
     *
     * 非线程安全，多个线程同时进入get方法，可能会创建几个不同的对象
     * @return
     */
    public static MyObject getInstance(){
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
