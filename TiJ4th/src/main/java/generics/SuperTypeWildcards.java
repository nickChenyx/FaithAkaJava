package generics;

import java.util.List;

/**
 * 超类型通配符，定义了下界，可以安全的操作 api
 * Created by Administrator on 2017/2/8.
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Bean1> bean1s){
        bean1s.add(new Bean1());
        bean1s.add(new Bean2());

        // bean1s.add(new Bean());  // Error 边界不对了
    }
}
