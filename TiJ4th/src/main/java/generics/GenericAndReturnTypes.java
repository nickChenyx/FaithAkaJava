package generics;

/**
 * 自限定泛型会产生确切的导出类型作为其返回值。
 * Created by Administrator on 2017/2/11.
 */
/*
*  GenericGetter<T extends GenericGetter<T>>
*      T 是 泛型参数
*      extends 定义泛型边界
*      GenericGetter<T> 边界
*      GenericGetter 接口接受泛型参数 T，而 T 由一个边界类限定，
*      这个边界就是拥有 T 作为其参数的 GenericGetter
* */
interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}
interface Getter extends GenericGetter<Getter>{}

@SuppressWarnings("unused")
public class GenericAndReturnTypes {
    /*
    * 这里 res 和 gg 都得到了确切的返回值类型！
    * */
    void test(Getter g){
        Getter res = g.get();
        GenericGetter gg = g.get();
    }
}
