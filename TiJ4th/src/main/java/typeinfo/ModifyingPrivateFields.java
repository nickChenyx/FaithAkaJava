package typeinfo;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/2/3.
 */
public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception{
        WithPrivateFinalField wf = new WithPrivateFinalField();
        System.out.println(wf);
        Field f = wf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(wf): " + f.getInt(wf));
        f.setInt(wf,42);
        System.out.println(wf);
        // final 域不可更改，运行时系统会在不抛异常的情况下接受任何参数，但是实际上不会发生改变
        f = wf.getClass().getDeclaredField("s1");
        f.setAccessible(true);
        System.out.println("f.get(wf): " + f.get(wf));
        f.set(wf,"No, you're not.");
        System.out.println(wf);
        f = wf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(wf): " + f.get(wf));
        f.set(wf,"No, you're not.");
        System.out.println(wf);
    }
}
class WithPrivateFinalField{
    private int i = 1;
    private final String s1 = "I'm totally safe";
    private String s2 = "Am I safe?";
    public String toString(){
        return "i = " + i + ", " + s1 + ", " + s2;
    }
}