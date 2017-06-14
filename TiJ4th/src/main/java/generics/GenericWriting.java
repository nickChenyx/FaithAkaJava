package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * ？？？ 奇怪 本来 writeExact 应该不能往 beanList 里加 Bean1，现在却编译不报错了，
 * 类型参数 T 竟然延伸了继承带来的特性！ 这应该是 writeWithWildcard 中 ? super T 超类型通配符带来的啊
 *
 * Created by Administrator on 2017/2/8.
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }

    static List<Bean1> bean1s = new ArrayList<Bean1>();
    static List<Bean> beans = new ArrayList<Bean>();

    static void f1(){
        writeExact(bean1s, new Bean1());
        writeExact(beans, new Bean1());  // 这里按照 Java编程思想 里说的会编译错误，因为 T 是不同的类型。
                                         // 我只用了 1.8 的版本，并不会编译错误了
    }

    static <T> void writeWithWildcard(List<? super T> list, T item){
        list.add(item);
    }

    static void f2(){
        writeWithWildcard(bean1s, new Bean1());
        writeWithWildcard(beans, new Bean1());
    }
    public static void main(String[] args) {
        f1();
        f2();
    }
}
