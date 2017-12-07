package com.nickchen.N04;

/**
 * 一个工具类，就比如像是 java.lang.Math | java.util.Arrays 一样，他们提供静态方法的过程化使用。
 * 不需要被实例化，需要防止他被实例化。
 * 覆盖私有的构造函数，并声明注释。该类不需要被实例化。
 *
 * @author nickChen
 *         create on 2017-12-07 10:46.
 */
public class UtilityClass {

    // Suppress default constructor for noninstantiability
    private UtilityClass () {
        throw new AssertionError();
    }
}
