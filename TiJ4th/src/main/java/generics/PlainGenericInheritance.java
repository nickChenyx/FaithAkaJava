package generics;

/**
 * 对应上文：SelfBoundingAndCovariantArguments.java
 *
 * 不适用自限定类型，普通的继承机制就会介入，这时候方法会被重载，就像在非泛型的情况下一样。
 * 非泛型的情况(OrdinaryArguments.java)
 * Created by Administrator on 2017/2/14.
 */
class GenericSetter<T>{// Not self-bounded
    void set(T arg){
        System.out.println("GenericSetter.set(Base)");
    }
}

class DerivedGS extends GenericSetter<Base>{
    void set(Derived derived){
        System.out.println("DerivedGS.set(Derived)");
    }
}
public class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base =  new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(base);
        dgs.set(derived);
        // output:
        // GenericSetter.set(Base)
        // DerivedGS.set(Derived)

    }
}
