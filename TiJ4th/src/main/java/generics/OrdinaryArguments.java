package generics;

/**
 * 非泛型代码中，参数类型不能随子类型变化而变化。 即这里 ds 里 重载而非重写了 set 方法，
 * 此时 ds 具有两个 set 方法，具有不同的参数。
 *
 * 对应下文：SelfBoundingAndCovariantArguments.java
 * Created by Administrator on 2017/2/14.
 */
class OrdinarySetter{
    void set(Base base){
        System.out.println("OrdinarySetter.set(Base)");
    }
}
class DerivedSetter extends OrdinarySetter{
    void set(Derived derived){
        System.out.println("DerivedSetter.set(Derived)");
    }
}
public class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        ds.set(base); // 编译时，重载了 set 方法，而非重写了 set。
    }
}
