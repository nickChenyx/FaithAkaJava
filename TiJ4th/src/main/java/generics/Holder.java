package generics;

/**
 * 利用泛型通配符的技巧决定哪些 api 的调用是安全的，哪些是不安全的
 * Created by Administrator on 2017/2/8.
 */
public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){ this.value = val;}
    public void set(T val){ this.value = val;}
    public T get(){ return this.value;}
    public boolean equals(Object obj){
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Bean1> bean1 = new Holder<Bean1>(new Bean1());
        Bean1 b = bean1.get();
        bean1.set(b);
        /**incompatible types.
                Required:
        Holder
                <generics.Bean>
        Found:
        Holder
                <generics.Bean1>
         */
        //Holder<Bean> bean = bean1;  //不能上溯造型
        Holder<? extends Bean> beanHolder = bean1;  //通配符
        Bean bean = beanHolder.get();
        Bean1 b1 = (Bean1)beanHolder.get(); // 默认返回的是 Object ，泛型是在边界上自动增加了 cast

        // beanHolder.set(b1); // 不能调用 holder 的 set 方法，因为这时候 set(T val) 的参数是类型参数 T 。
                         // 而使用了 <? extends Bean> 通配符，使得这时候编译器无法确定参数的具体类型，
                         // 编译器无法验证类型安全性，编译不通过。

        beanHolder.equals(bean);  // equals(obj) 方法运行良好，他的参数是 Object ！


    }
}
