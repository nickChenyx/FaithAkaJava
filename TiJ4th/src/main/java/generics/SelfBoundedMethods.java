package generics;

/**
 * 自限定作用于泛型方法 。
 * 可以防止这个方法被应用于除上述形式的自限定参数之外的任何事物上。
 * Created by Administrator on 2017/2/14.
 */
public class SelfBoundedMethods {
    static <T extends SelfBounded<T>> T f(T arg){
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        A a =  f(new A());
        // 编译错误， 这个实参不符合 f() 函数定义的形参格式：<T extends SelfBounded<T>>
        //demo d = f(new demo());
    }
}

class demo {}
