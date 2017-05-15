package designpattern;

/**
 * 饿汉模式 线程安全
 * Created by nickChenyx on 2017/4/14.
 */
public class Singleton1 {
    //类加载时完成了实例化
    private static final Singleton1 singleton = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getSingleton(){
        return singleton;
    }
}
