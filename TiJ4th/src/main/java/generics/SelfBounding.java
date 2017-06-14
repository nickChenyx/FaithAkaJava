package generics;
/**
 * 上文参考：Unconstrained.java
 * 自限定采取额外的步骤，强制泛型当作自己的边界参数来使用。
 * Created by Administrator on 2017/2/11.
 */
class SelfBounded<T extends SelfBounded<T>> {
    T element;
    SelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){ return element; }
}

class A extends SelfBounded<A>{}
class B extends SelfBounded<A>{}

class C extends SelfBounded<C>{
    C setAndGet(C arg){
        set(arg);
        return get();
    }
}

class D{}
// class E extends SelfBounded<D>{} // Type parameter 'generics.D' is not within its bound; should extend 'generics.SelfBounded<generics.D>

// 可以不使用自适应的语法 
class F extends SelfBounded{}

public class SelfBounding{
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
