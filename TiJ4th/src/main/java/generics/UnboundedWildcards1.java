package generics;

import java.util.List;

/**
 * 无界通配符 <?> 基本等价于使用原生类型，可以在下个例子中 UnboundedWildcards2.java 看到他的作用
 * Created by Administrator on 2017/2/9.
 */
public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list){
        list1 = list;
        list2 = list;
        list3 = list; // Unchecked assignment: 'java.util.List' to 'java.util.List<? extends java.lang.Object>'
    }
    static void assign2(List<?> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
    static void assign3(List<? extends Object> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
}
