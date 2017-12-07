package com.nickchen.N12;

/**
 * 考虑实现 Comparable 接口
 * <p>
 * 实现了 Comparable 接口的 compareTo 方法必须准从几条规则，大致和 {@link com.nickchen.N08.OverrideEqualsGeneralContract} 的规则相同。
 * <p>
 * 通常来说，(x.compareTo(y) == 0) == (x.equals(y))，如果这个不成立的话，需要在实现的 compareTo 方法上声明： “注意：该类具有内在排序功能，但是和equals不一样。”
 * <p>
 * 针对上面那条，已有的案例是 {@link java.math.BigDecimal}。如果使用 HashSet 来存储 BigDecimal，那么 BigDecimal(1.0) BigDecimal(1.00) 是两个不同的对象，
 * 在 HashSet 中会有两条记录，如果使用 TreeSet 来存储同样的两个 BigDecimal 的话，只会有一个对象被存储，因为 TreeSet 是通过 compareTo来比较的。
 *
 * @author nickChen
 * @date create on 2017-12-07 14:02.
 */
public class ImplementComparable implements Comparable<ImplementComparable> {
    private int value;

    /**
     * 如果存在多个值的比较，从最重要的值开始比较，如果该值相等，再比较次要的值。
     */
    @Override
    public int compareTo(ImplementComparable o) {
        return this.value - o.value; // 这样的比较方法可能会存在问题， 这个插值可能会大于 Integer.MAX_VALUE
    }
}



