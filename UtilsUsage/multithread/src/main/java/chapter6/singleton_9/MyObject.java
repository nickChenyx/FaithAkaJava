package chapter6.singleton_9;

import java.sql.Connection;

/**
 * @author nickChen
 * @create 2017-04-25 13:04.
 */
public enum MyObject {
    StrFactory;
    private String str;

    /**
     * 使用枚举类型时，构造方法被自动调用！
     * 线程安全
     */
    private MyObject(){
            str = new String("xxx");
    }
    public String getInstance(){
        return str;
    }
}
