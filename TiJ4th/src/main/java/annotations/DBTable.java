package annotations;

import java.lang.annotation.*;

/**
 *
 * 告诉注解处理器，为我生成一个数据库表
 * Created by Administrator on 2017/2/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    String name() default "";
}
