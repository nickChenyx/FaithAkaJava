package chapter3.ThreadLocal11;

/**
 * 如何给 ThreadLocal 设置初始值的做法
 * @author nickChen
 * @create 2017-04-24 10:00.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "这是我设置的默认值";
    }
}
