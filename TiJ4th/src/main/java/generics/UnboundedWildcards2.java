package generics;

import java.util.HashMap;
import java.util.Map;

/**
 * 无界通配符 <?> 当有多个泛型参数时，可以限定某个参数的边界，而另一个参数无界
 *
 * Created by Administrator on 2017/2/9.
 */
public class UnboundedWildcards2 {
    static Map map1;
    static Map<?,?> map2;
    static Map<String,?> map3;
    static void assign1(Map map){ map1 = map; }
    static void assign2(Map<?,?> map){ map2 = map; } // 等同于 Map
    static void assign3(Map<String,?> map){ map3 = map; }

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        assign3(new HashMap()); // unchecked
    }
}
