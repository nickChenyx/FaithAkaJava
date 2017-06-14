package generics;

/**
 * 泛型方法
 * 泛型方法可以单独存在于函数上，这样可以使代码更加清晰明白。
 * 只有使用了泛型的特殊语法，在调用泛型方法的时候，编译器会自动进行 类型参数推断 type argument inference
 * Created by Administrator on 2017/2/8.
 */
public class GenericMethods {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("s");
        gm.f(123); // 自动装包
        gm.f(1.2);
    }
}
