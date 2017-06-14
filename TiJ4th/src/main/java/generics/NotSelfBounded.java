package generics;

/**
 * 与 SelfBounded.java 类做对比补充。
 * Created by Administrator on 2017/2/14.
 */
public class NotSelfBounded<T> {
    T element;
    NotSelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){ return element; }
}

class A2 extends NotSelfBounded<A2>{}
class B2 extends NotSelfBounded<A2>{}

class C2 extends NotSelfBounded<C2>{
    C2 setAndGet(C2 arg){
        set(arg);
        return get();
    }
}

class D2 {}
/*
* 很明显，可以发现自限定限制可以强制作用于继承关系，如果需要使用自限定，就应该
* 了解这个类型参数将与使用这个参数的类具有相同的基类型。
* */
// 现在这样继承 持有 D2 类型的 NotSelfBounded 就不会编译错误了
class E2 extends NotSelfBounded<D2>{}
