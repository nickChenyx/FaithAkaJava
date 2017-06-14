package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 元注解
 * @Target 定义注解将应用于什么地方
 * @Retention 定义该注解在哪一级别可用，在源代码(SOURCE)、类文件(CLASS)或者运行时(RUNTIME)
 *
 * 没有元素的注解叫做标记注解(marker annotation) 这里的 @Test 就是
 * Created by Administrator on 2017/2/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test { }
