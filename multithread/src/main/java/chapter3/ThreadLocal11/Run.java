package chapter3.ThreadLocal11;

/**
 * 初识 ThreadLocal ，在线程之间存放线程私有值
 * @author nickChen
 * @create 2017-04-24 9:49.
 */
public class Run {
    public static ThreadLocal tl= new ThreadLocal();

    public static void main(String[] args) {
        if (tl.get()==null){
            System.out.println("没有设置值");
            tl.set("myValue");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }


}
