package com.nickchen.N03;

/**
 * 使用 enum 来设计一个单例类。
 * 和 static final field 相比，它无偿提供了序列化机制，也可以防止多次实例化的行为，同时是线程安全。
 *
 * static final field 需要设置所有的实例域为 transient，才可以保证单例，
 * 同样也需要在构造函数类有判断，才能防止反射调用生成多个实例。
 *
 * 比较之下 enum 就非常简单了。
 * @author nickChen
 *         create on 2017-12-07 10:31.
 */
public class EnumSingleton {

    public static void main(String[] args) {
        Foo.INSTANCE.print();
    }
}

enum Foo {
    INSTANCE;
    private Foo() {}
    public Foo getInstance() {
        return INSTANCE;
    }
    public void print() {
        System.out.println("Enum Singleton print()");
    }
}
