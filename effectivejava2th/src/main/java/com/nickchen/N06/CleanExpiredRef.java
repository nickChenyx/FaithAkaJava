package com.nickchen.N06;

/**
 * 消除过期的对象引用
 *
 * 1. 类中持有的另一个类的引用，在语义上删除该引用类时，没有实质上剔除该引用类的引用，从而造成内存泄漏 {@link Stack}
 * 2. 缓存中存在的内存泄漏。如 ThreadLocalMap 中的 WeakReference，在GC时 key为null，但是 key对应的value还持有着引用，从而导致内存泄漏。
 * 3. 监听器和回调。 注册回调时，没有显示的取消注册。
 *
 * @author nickChen
 *         create on 2017-12-07 11:25.
 */
public class CleanExpiredRef {

}


/**
 * {@link Stack#pop()} 操作中产生了内存泄漏
 */
class Stack {
    private int size;
    private Object[] element;

    public void push(Object o) {
        element[size++] = o;
    }

    public Object pop() {
        return element[--size];
    }
}
