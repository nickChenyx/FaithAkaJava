package com.nickchen.N07;

/**
 * 避免使用终结方法
 * <p>
 * 不要使用 finalizer 方法，这会带来与期望不符的行为。
 * <p>
 * 显示的终止方法通常是 try-finally 结合使用。
 * <p>
 * finalizer 方法的优点：
 * <p> 1. 充当安全网，确保对象在关闭的时候一定释放了资源。如 FileInputStream 中使用，在没有显示关闭的资源的时候，他提供了最后一层关闭操作。
 * <p> 2. 对象的本地对等体（native peer）关闭资源操作。
 * <p>
 * 需要注意的点：
 * <p>
 * 如果子类和父类都有对应的 finalizer 方法，子类关闭时需要在 try-finally 中调用父类的 finalizer 方法，这样即使子类的 finalizer 方法发生了错误，父类也能执行。
 * <p>
 * 面对这种子类可能出现恶意不执行父类 finalizer 的情况，可以使用 "终结方法守卫者(finalizer guardian)" 在父类里执行终结行为。
 *
 * @author nickChen
 *         create on 2017-12-07 11:53.
 */
public class AvoidFinalizer {

}

/**
 * Foo 没有 finalizer 方法，依赖 finalizerGuardian 来关闭关键资源。
 */
class Foo {
    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            // finalize outer Foo object
        }
    };
}