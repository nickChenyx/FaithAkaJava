package chapter6.singleton_7_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author nickChen
 * @create 2017-04-25 11:15.
 */
public class MyObject implements Serializable{
    private static final long serialVersionUID = 555L; // 假面骑士555
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

    // 解决反序列化之后 变量hashcode改变的问题
/*    protected Object readResolve() throws ObjectStreamException{
        System.out.println("call readResolve()");
        return MyObjectHandler.myObject;
    }*/
}
