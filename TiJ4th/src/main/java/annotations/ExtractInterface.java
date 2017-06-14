package annotations;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/2/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    String value();
}
