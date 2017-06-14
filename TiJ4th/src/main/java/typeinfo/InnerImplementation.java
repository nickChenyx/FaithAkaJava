package typeinfo;

import typeinfo.interfacea.A;

/**
 * Created by Administrator on 2017/2/3.
 */
public class InnerImplementation {
    public static void main(String[] args) throws Exception{
        A a =  new InnerA().makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // 反射还是可以进入私有内部类
        HiddenImplementation.CallHiddenMethod(a,"f");
        HiddenImplementation.CallHiddenMethod(a,"g");
        HiddenImplementation.CallHiddenMethod(a,"p");

    }
}
class InnerA{
    // 实现一个私有内部类，看是否安全，外部能否调用
    private static class C implements A {
        public void f(){
            System.out.println("public C.f()");
        }
        public void g(){
            System.out.println("public C.g()");
        }
        private void p(){
            System.out.println("private C.p()");
        }
    }
    public static A makeA(){
        return new C();
    }
}
