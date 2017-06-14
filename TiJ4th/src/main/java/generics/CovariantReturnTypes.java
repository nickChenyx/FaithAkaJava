package generics;

/**
 * 自限定类型的价值在于他们可以产生 “协变参数类型” —— 方法参数类型会随子类而改变。
 * 这段代码只能在使用囊括了协变返回类型的 Java SE5版本上编译成功。
 * Created by Administrator on 2017/2/11.
 */
class Base{}
class Derived extends Base{}

interface OrdinaryGetter{
    Base get();
}

interface DerivedGetter extends OrdinaryGetter{
    Derived get();
}
public class CovariantReturnTypes {
    void test(DerivedGetter d){
        Derived de = d.get();
    }
}
