package chapter6.singleton_10;

/**
 * @author nickChen
 * @create 2017-04-25 13:04.
 */
public class MyObject {
    /**
     * 较 singleton_10 完成了一次封装，代码逻辑性更好
     */
    public enum MyEnumSingleton{
        StrFactory;
        private String str;
        /**
         * 使用枚举类型时，构造方法被自动调用！
         * 线程安全
         */
        private MyEnumSingleton(){
            str = new String("xxx");
        }
        public String getInstance(){
            return str;
        }
    }
    public static String getInstance(){
        return MyEnumSingleton.StrFactory.getInstance();
    }




}
