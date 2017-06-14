package generics;

/**
 * 正常的泛型类使用
 * 对应下文：SelfBounded.java
 * Created by Administrator on 2017/2/11.
 */
class Other{}
class BasicOther extends BasicHolder<Other>{}

public class Unconstrained {
    public static void main(String[] args) {
        BasicOther b = new BasicOther();
        b.set(new Other());
        Other other = b.get();
        b.f();
    }
}
