package generics;

/**
 * 对应上文； OrdinaryArguments.java
 *
 * 使用自限定类型时。导出类只有一个方法，这个方法接受导出类型而不接受基类型作为参数。
 *
 * 编译器不能识别将基类型当作参数传递给 set 做法，因为没有任何方法具有这样的参数签名。
 * 实际上，这个参数已经被覆盖(overwritten)
 *
 * 对应下文：PlainGenericInheritance.java
 * Created by Administrator on 2017/2/14.
 */
interface SelfBoundedSetter<T extends SelfBoundedSetter<T>>{
    void set(T arg);
}

interface Setter extends SelfBoundedSetter<Setter>{}

public class SelfBoundingAndCovariantArguments {
    void testA(Setter s1,Setter s2,SelfBoundedSetter sbs){
        s1.set(s2);
        //s1.set(sbs);  //Error
        /*
        * set(generics.Setter)
            in SelfBoundedSetter cannot be applied
            to
          (generics.SelfBoundedSetter)
        * */
    }

}
