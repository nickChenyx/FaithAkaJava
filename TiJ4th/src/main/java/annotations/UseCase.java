package annotations;

import java.lang.annotation.*;

/**
 * @UseCase 对建立的使用案例做申明，方便记录功能已经实现，而哪些没有
 * Created by Administrator on 2017/2/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    int id();
    String description() default "no description";
}
