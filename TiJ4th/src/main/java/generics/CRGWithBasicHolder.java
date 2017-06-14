package generics;

/**
 * 新类 Subtype 接受的参数和返回的值具有 Subtype 类型而不仅仅是基类 BasicHolder 类型。
 * 这就是 CRG(CuriouslyRecurringGeneric) 的本质： 基类(BasicHolder)用导出类(Subtype)替代其参数。
 *
 * 这意味着，泛型基类变成了一种其所有导出类的公共功能的模板，这些功能对于其所有参数和返回值，将使用导出类型。（即返回确切类型）
 *
 * Created by Administrator on 2017/2/11.
 */
class Subtype extends BasicHolder<Subtype>{}

public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1 = new Subtype();
        Subtype st2 = new Subtype();
        st1.set(st2);
        Subtype st3 = st1.get();
        st1.f();
    }
}
