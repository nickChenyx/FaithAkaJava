package chapter3.InheritableThreadLocal2;

import java.util.Date;

/**
 * @author nickChen
 * @create 2017-04-24 10:03.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+"　我在子线程加的！";
    }
}
