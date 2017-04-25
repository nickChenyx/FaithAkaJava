package chapter6.singleton_8;

/**
 * @author nickChen
 * @create 2017-04-25 13:01.
 */
public class MyObject {
    private static MyObject instance;
    private MyObject(){}

    /**
     * 利用 static 代码块
     * static代码块会在类第一次使用时就被执行
     */
    static {
        instance = new MyObject();
    }
    public static MyObject getInstance(){
        return instance;
    }

}
