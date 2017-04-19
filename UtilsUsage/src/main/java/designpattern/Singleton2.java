package designpattern;

/**
 * 静态内部类实现单例
 * Created by nickChenyx on 2017/4/14.
 */
public class Singleton2 {
    private static class SingletonHolder {
        // 类加载时被初始化
        private static final Singleton2 INSTANCE = new Singleton2();
    }
    private Singleton2 (){}
    public static final Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
