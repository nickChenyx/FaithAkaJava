package com.nickchen.N05;

/**
 * 避免重复创建不必要的对象（通常指大对象
 *
 * @author nickChen
 *         create on 2017-12-07 11:09.
 */
public class CreateAndDestroyObj {

    /**
     * 毫无必要的操作，这个过程中多创建了一个 "waooo" 实例
     */
    public void emample01 () {
        String s = new String("waooo");
    }

    /**
     * 计算所有 int 类型的和，但是这里出现了 autoboxing。
     *
     * Long 和 long 类型的自动拆装箱。
     *
     * sum+=i 这句话会多创建 2^31次个 Long 对象，耗费远比计算多的时间。
     *
     * 尽量直接使用基本类型，而非装箱后的类型。
     */
    public void example02 () {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
    }
}
