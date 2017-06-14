package generics;

/**
 * 在使用 javac 1.8 时，f1(raw) 不会产生 warning。
 * 本例意在展示 捕获转换 技术。
 * f1中如果传入原生类型会产生 warning
 * f2(使用了 无界通配符<?> ，传入的原生类型，编译器可能会推断出实际的类型参数，
 *    从而在调用具体类型f1()时可以传入明确的类型。从而产生 warning)
 * Created by Administrator on 2017/2/9.
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }
    static void f2(Holder<?> holder){
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);
        f2(raw);

        Holder rawBasic = new Holder();
        rawBasic.set(new Object());  // Unchecked call to 'set(T)' as a member of raw type 'generics.Holder'
        f2(rawBasic);

        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
}
