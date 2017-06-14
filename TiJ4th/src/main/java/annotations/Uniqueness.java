package annotations;

/**
 * Created by Administrator on 2017/2/15.
 */

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
