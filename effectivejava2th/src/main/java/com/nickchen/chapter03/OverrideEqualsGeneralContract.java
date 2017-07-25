package com.nickchen.chapter03;

/**
 * equals 方法实现了等价关系：
 * - 自反性 对于任何非null的引用值x， x.equals(x) 必须返回true
 * - 对称性 对于任何非null的引用值x和y， 当且仅当 y.equals(x) 返回 true 时， x.equals(y) 必须返回 true
 * - 传递性 对于任何非null的引用值x、y和z， 如果 x.equals(y) 返回 true ，并且 y.equals(z)也返回 true，那么 x.equals(z)也必须返回 true
 * - 一致性 对于任何非null的引用值x和y， 只要equals的比较操作在对象中所用的信息没有被修改，多次调用 x.equals(y)就会返回一致的结果
 * - 对于任何非null的引用值x，x.equals(null) 必须返回false
 *
 * @author nickChen
 * @create 2017-07-25 10:47.
 */
public class OverrideEqualsGeneralContract {
    private final String test = "ttt";

    /**
     * 高质量 equals 实现
     *
     * 对于 基本类型可以直接使用 == 进行比较，float使用 Float.compare ，double 使用 Double.compare 方法进行比较，
     * 对象引用可以调用 equals 进行递归调用
     *
     * 对于允许为null的对象，可以使用如下方式判断
     * (field == null ?　ｏ.field == null : field.equals(o.field))
     * 如果 field 的引用相同，如下方法会更快
     * (field == o.field || (field == null ?　ｏ.field == null : field.equals(o.field)))
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)  // 是否为本对象的引用
            return true;
        if (!(obj instanceof OverrideEqualsGeneralContract))  // 类型是否正确， instanceof 中 obj 如果为 null，直接返回 false
            return false;
        OverrideEqualsGeneralContract o = (OverrideEqualsGeneralContract) obj;
        return o.test.equals(this.test);
    }

    public static void main(String[] args) {
        OverrideEqualsGeneralContract egc = new OverrideEqualsGeneralContract();
        egc.testCaseInsensitiveString();
    }

    // 违反了 对称性！！！
    void testCaseInsensitiveString(){
        CaseInsensitiveString cs = new CaseInsensitiveString("123");
        String s = "123";
        System.out.println(cs.equals(s));
        System.out.println(s.equals(cs));
    }
    final class CaseInsensitiveString{
        private final String s;
        CaseInsensitiveString(String str){
            s = str;
        }
        @Override
        public boolean equals(Object o){
            if (o instanceof CaseInsensitiveString)
                return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
            if (o instanceof String)
                return s.equalsIgnoreCase((String) o);
            return false;
        }
    }

}
