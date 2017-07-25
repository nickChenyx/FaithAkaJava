package com.nickchen.chapter03;


import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * 重写 equals 须重写 hashcode
 *
 * 1. 预存一个非零的常数值，例如17，保存在 int result中
 * 2. 对于每个关键域（逻辑上需要确认相等的重要字段），计算出对应的散列码 c：
 *   a. 为该域计算出int类型的散列码 c：
 *     i. 如果是 boolean， 计算 (f ? 1: 0)
 *     ii. byte/char/short/int/  ==>  (int)f
 *     iii. long  ==> (int)(f^(f>>>32))
 *     iv. float  ==> Float.floatToIntBits(f)
 *     v. double  ==> Double.doubleToLongBits(f) , 再重复 ii. 的操作
 *     vi. 对象引用  ==> hashcode() | 若为 null，返回 0  这里对象本身如果重写了equals必须重写hashcode
 *     vii. 数组 ==> 使用2.b的方法将重要的元素的散列码加起来，如果都重要，可以直接使用Arrays.hashCode
 *   b.按照下面的公式，把步骤2.a中计算出的散列码 c 加到result中
 *     result = 31*result + c;
 * 3. 返回 result
 *
 * @author nickChen
 * @create 2017-07-25 13:44.
 */
public class OverrideHashCode {
    @NotNull
    private String str = "string ...";
    private int i = 1;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof OverrideHashCode))
            return false;
        OverrideHashCode o = (OverrideHashCode) obj;
        return o.str.equals(this.str) && o.i == this.i;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Map map = new HashMap();
        OverrideHashCode o1 = new OverrideHashCode();
        OverrideHashCode o2 = new OverrideHashCode();
        map.put(o1,1);
        map.put(o2,2);
        /*
        若是不重写 hashcode 这时候返回的分别是 1 2
        但是两个对象实际上是相等的，因为他们具有相同的成员变量，逻辑上相等，应该给予他们相等的物理上的相等，
        不然会造成在集合中散列相关的集合中出现错误。
         */
        System.out.println(map.get(o1));
        System.out.println(map.get(o2));
    }

    /**
     * 重写 hashcode，在散列表中可以认为是相同的对象
     * @return
     */
    @Override
    public int hashCode() {
        // 这里简写了hashcode的生成
        return this.str.hashCode() + this.i << 8;
    }
/*
    //延迟初始化散列码，并且缓存上hashCode（当计算hashCode频繁，或者开销大时
    private volatile int hashCode;
    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0){
            result = 17;
            result = 31*result + str.hashCode();
            result = 31*result + i;
            hashCode = result;
        }
        return result;
    }
*/

}
