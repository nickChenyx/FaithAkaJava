package annotations;

import java.lang.annotation.*;

/**
 * 数据库表的约束条件注解
 * Created by Administrator on 2017/2/15.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
    boolean primaryKey() default false;
    boolean allowNull() default true;
    boolean unique() default false;
}
